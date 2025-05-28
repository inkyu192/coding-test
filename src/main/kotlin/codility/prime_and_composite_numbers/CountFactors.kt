package codility.prime_and_composite_numbers

import kotlin.math.sqrt

class CountFactors {
    fun solution(N: Int): Int {
        var count = 0
        val sqrt = sqrt(N.toDouble()).toInt()

        for (i in 1..sqrt) {
            if (N % i == 0) {
                count += if (i * i == N) 1 else 2
            }
        }

        return count
    }
}