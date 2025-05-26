package codility.counting_elements

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class PermCheckTest {
    private val permCheck = PermCheck()

    @Test
    fun case1() {
        val result = permCheck.solution(A = intArrayOf(4, 1, 3, 2))
        Assertions.assertThat(result).isEqualTo(1)
    }

    @Test
    fun case2() {
        val result = permCheck.solution(A = intArrayOf(4, 1, 3))
        Assertions.assertThat(result).isEqualTo(0)
    }

    @Test
    fun case3() {
        val result = permCheck.solution(A = intArrayOf(4, 1, 3, 2, 2))
        Assertions.assertThat(result).isEqualTo(0)
    }
}