package codility.caterpillar_method

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class CountTrianglesTest {
    private val countTriangles = CountTriangles()

    @Test
    fun case1() {
        val result = countTriangles.solution(intArrayOf(10, 2, 5, 1, 8, 12))
        Assertions.assertThat(result).isEqualTo(4)
    }
}