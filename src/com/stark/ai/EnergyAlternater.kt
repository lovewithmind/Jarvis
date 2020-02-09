package com.stark.ai

class EnergyAlternater(private val arthematicComputer: ArthematicComputer) {

    fun calculateEnergy(q: MutableList<String>,N: Int,set: MutableSet<Int>): String {
        var t: String = "1"
        q.add(t)

        while (!q.isEmpty()) {
            t = q[0]
            q.removeAt(0);

            val rem = arthematicComputer.mod(t, N);

            if (rem == 0)
                return t

            else if (!set.contains(rem)) {
                set.add(rem)
                q.add(t + "0")
                q.add(t + "1")
            }
        }
        return "Sorry can not find the energy value"
    }
}