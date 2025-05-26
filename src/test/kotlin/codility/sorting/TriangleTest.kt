package codility.sorting

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class TriangleTest {
    val triangle = Triangle()

    @Test
    fun case1() {
        val result = triangle.solution(intArrayOf(10, 2, 5, 1, 8, 20))
        Assertions.assertThat(result).isEqualTo(1)
    }

    @Test
    fun case2() {
        val result = triangle.solution(intArrayOf(10, 50, 5, 1))
        Assertions.assertThat(result).isEqualTo(0)
    }
}