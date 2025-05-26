package codility.counting_elements

class PermCheck {
    fun solution(A: IntArray): Int {
        val set = A.toSet()

        if (set.size != A.size || set.size != A.max()) {
            return 0
        }

        return 1
    }
}