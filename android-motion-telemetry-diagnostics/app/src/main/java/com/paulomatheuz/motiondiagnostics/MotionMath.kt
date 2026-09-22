package com.paulomatheuz.motiondiagnostics

import kotlin.math.sqrt

fun calculateMagnitude(x: Float, y: Float, z: Float): Float {
    return sqrt((x * x) + (y * y) + (z * z))
}