package codility.prime_and_composite_numbers

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class CountFactorsTest {
    private val countFactors = CountFactors()

    @Test
    fun case1() {
        val result = countFactors.solution(24)
        Assertions.assertThat(result).isEqualTo(8)
    }


    @Test
    fun case2() {
        val result = countFactors.solution(16)
        Assertions.assertThat(result).isEqualTo(5)
    }
}