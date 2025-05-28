package codility.caterpillar_method

class CountTriangles {
    fun solution(A: IntArray): Int {
        A.sort()
        var count = 0

        for (i in 0 until A.size - 2) {
            var k = i + 2
            for (j in i + 1 until A.size - 1) {
                while (k < A.size && A[i].toLong() + A[j].toLong() > A[k].toLong()) {
                    k++
                }
                count += k - j - 1
            }
        }

        return count
    }
}