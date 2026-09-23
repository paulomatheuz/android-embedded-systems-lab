package com.paulomatheuz.motiondiagnostics

import kotlin.math.sqrt

private const val STABLE_THRESHOLD = 0.10f
private const val STRONG_MOTION_THRESHOLD = 2.0f

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

    return calculateMagnitude(deltaX, deltaY, deltaZ)
}

fun classifyMotionIntensity(intensity: Float): MotionStatus {
    return when {
        intensity < STABLE_THRESHOLD -> MotionStatus.STABLE
        intensity < STRONG_MOTION_THRESHOLD -> MotionStatus.MOVING
        else -> MotionStatus.STRONG_MOTION
    }
}
