package codility.leader

class EquiLeader {
    fun solution(A: IntArray): Int {
        var leader = 0
        var tempCount = 0

        for (i in A.indices) {
            if (tempCount == 0) {
                leader = A[i]
                tempCount++
            } else {
                if (leader == A[i]) tempCount++ else tempCount--
            }
        }

        val leaderCount = A.count { it == leader }
        if (leaderCount <= A.size / 2) return 0

        var equiLeaderCount = 0
        var leftLeaderCount = 0

        for (i in 0..A.lastIndex - 1) {
            if (A[i] == leader) leftLeaderCount++

            val leftSize = i + 1
            val rightSize = A.size - leftSize

            if (leftLeaderCount > leftSize / 2 && leaderCount - leftLeaderCount > rightSize / 2) {
                equiLeaderCount++
            }
        }

        return equiLeaderCount
    }
}