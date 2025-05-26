package codility.sorting

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class MaxProductOfThreeTest {
    private val maxProductOfThree = MaxProductOfThree()

    @Test
    fun case1() {
        val result = maxProductOfThree.solution(A = intArrayOf(-3, 1, 2, -2, 5, 6))
        Assertions.assertThat(result).isEqualTo(60)
    }
}