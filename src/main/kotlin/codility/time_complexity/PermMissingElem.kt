package codility.time_complexity

class PermMissingElem {
    fun solution(A: IntArray): Int {
        val total = (A.size + 1).toLong() * (A.size + 2).toLong() / 2L
        return (total - A.sum().toLong()).toInt()
    }
}