package codility.arrays

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class CyclicRotationTest {
    private val cyclicRotation = CyclicRotation()

    @Test
    fun case1() {
        val result = cyclicRotation.solution(A = intArrayOf(3, 8, 9, 7, 6), K = 3)
        Assertions.assertThat(result).containsExactly(9, 7, 6, 3, 8)
    }

    @Test
    fun case2() {
        val result = cyclicRotation.solution(A = intArrayOf(0, 0, 0), K = 1)
        Assertions.assertThat(result).containsExactly(0, 0, 0)
    }

    @Test
    fun case3() {
        val result = cyclicRotation.solution(A = intArrayOf(1, 2, 3, 4), K = 4)
        Assertions.assertThat(result).containsExactly(1, 2, 3, 4)
    }
}