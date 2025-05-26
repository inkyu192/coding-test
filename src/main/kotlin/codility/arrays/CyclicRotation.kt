package codility.arrays

class CyclicRotation {
    fun solution(A: IntArray, K: Int): IntArray {
        val result = IntArray(A.size)

        for (i in A.indices) {
            result[(i + K) % A.size] = A[i]
        }

        return result
    }
}