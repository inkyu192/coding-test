package codility.caterpillar_method

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class CountDistinctSlicesTest {
    private val countDistinctSlices = CountDistinctSlices()

    @Test
    fun case1() {
        val result = countDistinctSlices.solution(6, intArrayOf(3, 4, 5, 5, 2))
        Assertions.assertThat(result).isEqualTo(9)
    }
}