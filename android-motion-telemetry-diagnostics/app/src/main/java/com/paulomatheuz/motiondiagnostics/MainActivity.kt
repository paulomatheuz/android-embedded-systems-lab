package com.paulomatheuz.motiondiagnostics

import android.content.Context
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import android.os.Bundle
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
    private val xState = mutableStateOf(0f)
    private val yState = mutableStateOf(0f)
    private val zState = mutableStateOf(0f)

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
                        Text(text = "X: ${xState.value}")
                        Text(text = "Y: ${yState.value}")
                        Text(text = "Z: ${zState.value}")
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
        super.onPause()
    }

    override fun onAccuracyChanged(sensor: Sensor?, accuracy: Int) {
    }

    override fun onSensorChanged(event: SensorEvent?) {
        if (event != null) {
            val x = event.values[0]
            val y = event.values[1]
            val z = event.values[2]

            xState.value = x
            yState.value = y
            zState.value = z

            Log.d("MotionDiagnostics", "Valor x: $x, Valor y: $y, Valor z: $z")
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
