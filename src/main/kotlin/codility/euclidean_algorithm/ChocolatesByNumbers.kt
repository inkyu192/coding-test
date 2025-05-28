package codility.euclidean_algorithm


class ChocolatesByNumbers {
    fun solution(N: Int, M: Int): Int {
        val gcd = gcd(N, M)
        return N / gcd
    }

    fun gcd(a: Int, b: Int): Int {
        return if (b == 0) a else gcd(b, a % b)
    }
}