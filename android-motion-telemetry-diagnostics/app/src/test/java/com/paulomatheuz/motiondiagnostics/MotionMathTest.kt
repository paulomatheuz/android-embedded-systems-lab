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
}
