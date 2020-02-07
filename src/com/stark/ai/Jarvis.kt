package com.stark.ai

class Jarvis {
    fun help(string: String, N: Int): String {
        val q = mutableListOf<String>()
        val visit = mutableSetOf<Int>()

        var t: String = "1"
        q.add(t)

        while (!q.isEmpty()) {
            t = q[0]
            q.removeAt(0);

            val rem = mod(t, N);

            if (rem == 0)
                return t

            else if (!visit.contains(rem)) {
                visit.add(rem)
                q.add(t + "0")
                q.add(t + "1")
            }
        }
        return "Sorry Can't help"
    }


    fun mod(t: String, N: Int): Int {
        var r = 0
        for (element in t) {
            r = r * 10 + (element - '0');
            r %= N;
        }
        return r
    }
}