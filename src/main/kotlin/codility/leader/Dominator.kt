package codility.leader

class Dominator {
    fun solution(A: IntArray): Int {
        if (A.isEmpty()) return -1

        var value = 0
        var size = 0

        for (i in A.indices) {
            if (size == 0) {
                value = A[i]
                size++
            } else {
                if (value == A[i]) size++
                else size--
            }
        }

        val candidate = value
        var candidateCount = 0
        var candidateLastIndex = 0

        for (i in A.indices) {
            if (candidate == A[i]) {
                candidateCount++
                candidateLastIndex = i
            }
        }

        return if (candidateCount > A.size / 2) candidateLastIndex else -1
    }
}