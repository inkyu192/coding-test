package codility.maximum_slice_problem

class MaxSliceSum {
    fun solution(A: IntArray): Int {
        var currentMax = A[0]
        var globalMax = A[0]

        for (i in 1 until A.size) {
            currentMax = maxOf(A[i], currentMax + A[i])
            globalMax = maxOf(globalMax, currentMax)
        }

        return globalMax
    }
}