package codility.prime_and_composite_numbers

import kotlin.math.sqrt

class MinPerimeterRectangle {
    fun solution(N: Int): Int {
        val sqrt = sqrt(N.toDouble()).toInt()
        var min = Int.MAX_VALUE

        for (i in 1..sqrt) {
            if (N % i == 0) {
                min = minOf(min, (i + N / i) *2)
            }
        }

        return min
    }
}