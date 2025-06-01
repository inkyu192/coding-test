package codility.greedy_algorithms

class MaxNonoverlappingSegments {
    fun solution(A: IntArray, B: IntArray): Int {
        if (A.isEmpty()) return 0

        var count = 1
        var lastEnd = B[0]

        for (i in 1..A.lastIndex) {
            if (A[i] > lastEnd) {
                count++
                lastEnd = B[i]
            }
        }
        
        return count
    }
}