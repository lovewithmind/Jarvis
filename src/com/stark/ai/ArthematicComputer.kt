package com.stark.ai

class ArthematicComputer {
    fun mod(t: String, N: Int): Int {
        var r = 0
        for (element in t) {
            r = r * 10 + (element - '0')
            r %= N
        }
        return r
    }
}