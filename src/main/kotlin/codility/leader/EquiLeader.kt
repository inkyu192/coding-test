package codility.leader

class EquiLeader {
    fun solution(A: IntArray): Int {
        var value = 0
        var count = 0

        for (i in A.indices) {
            if (i == 0) {
                value = A[i]
                count++
            } else {
                if (value == A[i]) count++
                else count--
            }
        }

        val candidateCount = A.count { it == value }
        if (candidateCount <= A.size / 2) return 0

        var equiLeaders = 0
        var leftCount = 0

        for (i in 0..A.lastIndex - 1) {
            if (A[i] == value) leftCount++
        }

        return 0
    }
}