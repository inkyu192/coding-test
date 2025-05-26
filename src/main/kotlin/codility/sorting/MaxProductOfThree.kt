package codility.sorting

class MaxProductOfThree {
    fun solution(A: IntArray): Int {
        A.sort()

        val max1 = A[A.lastIndex - 2] * A[A.lastIndex - 1] * A[A.lastIndex]
        val max2 = A[0] * A[1] * A[A.lastIndex]

        return maxOf(a = max1, b = max2)
    }
}