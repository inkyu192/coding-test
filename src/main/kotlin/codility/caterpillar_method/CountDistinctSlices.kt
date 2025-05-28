package codility.caterpillar_method

class CountDistinctSlices {
    fun solution(M: Int, A: IntArray): Int {
        val booleans = BooleanArray(M + 1)
        var count = 0
        var start = 0

        for ((end, value) in A.withIndex()) {
            while (booleans[value]) {
                booleans[A[start]] = false
                start++
            }

            booleans[value] = true
            count += end - start + 1

            if (count > 1_000_000_000) return 1_000_000_000
        }

        return count
    }
}