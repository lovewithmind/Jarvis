package com.stark.ai

class Jarvis(private val energyAlternater: EnergyAlternater) {
    fun help(string: String, N: Int): String {
        val q = mutableListOf<String>()
        val set = mutableSetOf<Int>()
        return energyAlternater.calculateEnergy(q, N, set)
    }
}