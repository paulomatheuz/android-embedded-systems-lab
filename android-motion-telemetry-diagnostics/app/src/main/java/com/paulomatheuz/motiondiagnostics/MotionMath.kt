package com.paulomatheuz.motiondiagnostics

import kotlin.math.sqrt

enum class MotionStatus {
    STABLE,
    MOVING,
    STRONG_MOTION
}

fun calculateMagnitude(x: Float, y: Float, z: Float): Float {
    return sqrt((x * x) + (y * y) + (z * z))
}

fun calculateMotionIntensity(
    currentX: Float,
    currentY: Float,
    currentZ: Float,
    previousX: Float,
    previousY: Float,
    previousZ: Float
): Float {
    val deltaX = currentX - previousX
    val deltaY = currentY - previousY
    val deltaZ = currentZ - previousZ

    val intensity = calculateMagnitude(deltaX, deltaY, deltaZ)

    return intensity
}

fun classifyMotionIntensity(intensity: Float): MotionStatus {
    return when {
        intensity < 0.10f -> MotionStatus.STABLE
        intensity < 2.0f -> MotionStatus.MOVING
        else -> MotionStatus.STRONG_MOTION
    }
}
