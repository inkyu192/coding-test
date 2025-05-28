package codility.caterpillar_method

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class AbsDistinctTest {
    private val absDistinct = AbsDistinct()

    @Test
    fun case1() {
        val result = absDistinct.solution(intArrayOf(-5, -3, -1, 0, 3, 6))
        Assertions.assertThat(result).isEqualTo(5)
    }
}