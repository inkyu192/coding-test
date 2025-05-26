package codility.sorting

class Distinct {
    fun solution(A: IntArray): Int {
        val set = A.toSet()
        return set.size
    }
}