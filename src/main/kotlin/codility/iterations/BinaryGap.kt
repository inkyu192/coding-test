package codility.iterations

class BinaryGap {
    fun solution(N: Int): Int {
        val binaryString = Integer.toBinaryString(N)
        var max = 0
        var count = 0

        for (i in binaryString.indices) {
            if (binaryString[i] == '0') {
                count++
            } else if (binaryString[i] == '1') {
                max = maxOf(a = max, b = count)
                count = 0
            }
        }

        return max
    }
}