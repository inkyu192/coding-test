package codility.prefix_sums

class PassingCars {
    fun solution(A: IntArray): Int {
        var totalCount = 0
        var leftToRightCount = 0

        for (i in A.indices) {
            if (A[i] == 0) {
                leftToRightCount++
            } else {
                totalCount += leftToRightCount
                if (totalCount > 1_000_000_000) return -1
            }
        }

        return totalCount
    }
}