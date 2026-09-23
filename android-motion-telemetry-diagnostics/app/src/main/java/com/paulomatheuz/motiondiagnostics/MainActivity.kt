package com.paulomatheuz.motiondiagnostics

import android.content.Context
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import android.os.Bundle
import android.os.SystemClock
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.paulomatheuz.motiondiagnostics.ui.theme.MotionDiagnosticsTheme

class MainActivity : ComponentActivity(), SensorEventListener {
    private lateinit var sensorManager: SensorManager
    private var accelerometer: Sensor? = null
    private var previousX: Float? = null
    private var previousY: Float? = null
    private var previousZ: Float? = null
    private val xState = mutableStateOf(0f)
    private val yState = mutableStateOf(0f)
    private val zState = mutableStateOf(0f)
    private val magnitudeState = mutableStateOf(0f)
    private val hasReadingState = mutableStateOf(false)
    private val motionIntensityState = mutableStateOf<Float?>(null)
    private val motionStatusState = mutableStateOf<MotionStatus?>(null)
    private var strongMotionVisibleUntilMillis = 0L

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        sensorManager = getSystemService(Context.SENSOR_SERVICE) as SensorManager
        accelerometer = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER)

        val statusResourceId =
            if (accelerometer != null) {
                R.string.status_available
            } else {
                R.string.status_unavailable
            }

        enableEdgeToEdge()
        setContent {
            MotionDiagnosticsTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column(modifier = Modifier.padding(innerPadding)) {
                        DiagnosticsStatus(
                            status = stringResource(statusResourceId)
                        )
                        if (hasReadingState.value) {
                            val xText = "%.2f".format(xState.value)
                            Text(text = "X: ${xText} m/s²")
                            val yText = "%.2f".format(yState.value)
                            Text(text = "Y: ${yText} m/s²")
                            val zText = "%.2f".format(zState.value)
                            Text(text = "Z: ${zText} m/s²")
                            val magnitudeText = "%.2f".format(magnitudeState.value)
                            Text(text = "Magnitude: ${magnitudeText} m/s²")

                            val currentIntensity = motionIntensityState.value
                            val currentStatus = motionStatusState.value
                            if (currentIntensity != null && currentStatus != null) {
                                val intensityText = "%.2f".format(currentIntensity)

                                Text(text = "Motion intensity: $intensityText m/s²")
                                Text(text = "Motion status: ${currentStatus.name}")
                            }
                        } else if (accelerometer != null) {
                            Text("Aguardando leitura")
                        }
                    }
                }
            }
        }
    }

    override fun onResume() {
        super.onResume()

        val currentAccelerometer = accelerometer
        if (currentAccelerometer != null) {
            sensorManager.registerListener(
                this,
                currentAccelerometer,
                SensorManager.SENSOR_DELAY_UI
            )
        }
    }

    override fun onPause() {
        sensorManager.unregisterListener(this)
        hasReadingState.value = false
        previousX = null
        previousY = null
        previousZ = null
        motionIntensityState.value = null
        motionStatusState.value = null
        strongMotionVisibleUntilMillis = 0L
        super.onPause()
    }

    override fun onAccuracyChanged(sensor: Sensor?, accuracy: Int) {
    }

    override fun onSensorChanged(event: SensorEvent?) {
        if (event != null) {
            val x = event.values[0]
            val y = event.values[1]
            val z = event.values[2]
            val lastX = previousX
            val lastY = previousY
            val lastZ = previousZ

            if (lastX != null && lastY != null && lastZ != null) {
                val motionIntensity = calculateMotionIntensity(
                    currentX = x,
                    currentY = y,
                    currentZ = z,
                    previousX = lastX,
                    previousY = lastY,
                    previousZ = lastZ
                )
                motionIntensityState.value = motionIntensity

                val detectedStatus = classifyMotionIntensity(motionIntensity)
                val nowMillis = SystemClock.elapsedRealtime()

                if (detectedStatus == MotionStatus.STRONG_MOTION) {
                    strongMotionVisibleUntilMillis = nowMillis + 750L
                }

                val statusToDisplay =
                    if (nowMillis < strongMotionVisibleUntilMillis) {
                        MotionStatus.STRONG_MOTION
                    } else {
                        detectedStatus
                    }

                motionStatusState.value = statusToDisplay

                Log.d("MotionDiagnostics", "Motion intensity: $motionIntensity")
            }

            previousX = x
            previousY = y
            previousZ = z

            xState.value = x
            yState.value = y
            zState.value = z

            val magnitude = calculateMagnitude(x, y, z)

            magnitudeState.value = magnitude

            hasReadingState.value = true

            Log.d("MotionDiagnostics", "Valor x: $x, Valor y: $y, Valor z: $z, Magnitude: $magnitude")
        }
    }
}

@Composable
fun DiagnosticsStatus(status: String, modifier: Modifier = Modifier) {
    Text(
        text = stringResource(R.string.diagnostics_status_format, status),
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun DiagnosticsStatusPreview() {
    MotionDiagnosticsTheme {
        DiagnosticsStatus(
            status = stringResource(R.string.status_available)
        )
    }
}
