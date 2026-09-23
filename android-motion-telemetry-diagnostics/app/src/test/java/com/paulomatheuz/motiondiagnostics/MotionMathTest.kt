package com.paulomatheuz.motiondiagnostics

import org.junit.Test
import org.junit.Assert.assertEquals

class MotionMathTest {
    @Test
    fun magnitude_threeFourZero_returnsFive() {
        assertEquals(
            5f,
            calculateMagnitude(3f, 4f, 0f),
            0.001f
        )
    }

    @Test
    fun motionIntensity_sameReadings_returnsZero() {
        assertEquals(
            0f,
            calculateMotionIntensity(
                currentX = 2f,
                currentY = 3f,
                currentZ = 4f,
                previousX = 2f,
                previousY = 3f,
                previousZ = 4f
            ),
            0.001f
        )
    }

    @Test
    fun classifyMotionIntensity_representativeValues_returnsExpectedStatuses() {
        assertEquals(
            MotionStatus.STABLE,
            classifyMotionIntensity(0.02f)
        )
        assertEquals(
            MotionStatus.MOVING,
            classifyMotionIntensity(0.80f)
        )
        assertEquals(
            MotionStatus.STRONG_MOTION,
            classifyMotionIntensity(3.50f)
        )
    }

    @Test
    fun motionIntensity_knownReadings_returnsFive() {
        assertEquals(
            5f,
            calculateMotionIntensity(
                currentX = 4f,
                currentY = 6f,
                currentZ = 3f,
                previousX = 1f,
                previousY = 2f,
                previousZ = 3f
            ),
            0.001f
        )
    }
}
