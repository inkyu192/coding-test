package codility.maximum_slice_problem

class MaxProfit {
    fun solution(A: IntArray): Int {
        var minPrice = Int.MAX_VALUE
        var maxProfit = 0

        for (i in A.indices) {
            if (A[i] < minPrice) {
                minPrice = A[i]
            } else {
                maxProfit = maxOf(a = maxProfit, b = A[i] - minPrice)
            }
        }

        return maxProfit
    }
}