package codility.greedy_algorithms

class TieRopes {
    fun solution(K: Int, A: IntArray): Int {
        var count = 0
        var length = 0

        for (i in A.indices) {
            length += A[i]

            if (length >= K) {
                count++
                length = 0
            }
        }

        return count
    }
}