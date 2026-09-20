package com.paulomatheuz.motiondiagnostics

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.paulomatheuz.motiondiagnostics.ui.theme.MotionDiagnosticsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MotionDiagnosticsTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    DiagnosticsStatus(
                        status = "online",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun DiagnosticsStatus(status: String, modifier: Modifier = Modifier) {
    Text(
        text = "Motion Diagnostics: $status",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun DiagnosticsStatusPreview() {
    MotionDiagnosticsTheme {
        DiagnosticsStatus("online")
    }
}