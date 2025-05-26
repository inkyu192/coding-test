package codility.time_complexity

import kotlin.math.abs

class TapeEquilibrium {
    fun solution(A: IntArray): Int {
        var minSum = Int.MAX_VALUE
        val totalSum = A.sum()
        var leftSum = 0

        for (i in 0..A.lastIndex - 1) {
            leftSum = leftSum + A[i]
            val rightSum = totalSum - leftSum

            minSum = minOf(a = minSum, b = abs(leftSum - rightSum))
        }

        return minSum
    }
}