package com.stark.ai

import org.junit.Test
import kotlin.test.assertEquals

class ArthematicComputerTest{
    @Test
    fun `should return 0 for EMPTY string`() {
        val mod = ArthematicComputer().mod("", 13)
        assertEquals(mod,0)
    }
}

