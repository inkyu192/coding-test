package codility.counting_elements

class FrogRiverOne {
    fun solution(X: Int, A: IntArray): Int {
        val set = HashSet<Int>()

        for (i in A.indices) {
            set.add(A[i])

            if (set.size == X) {
                return i
            }
        }

        return -1
    }
}