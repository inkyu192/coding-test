package codility.caterpillar_method

import kotlin.math.abs

class AbsDistinct {
    fun solution(A: IntArray): Int {
        return A.map { abs(it) }.distinct().size
    }
}