package codility.sorting

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class DistinctTest {
    val distinct = Distinct()

    @Test
    fun case1() {
        val result = distinct.solution(A = intArrayOf(2, 1, 1, 2, 3, 1))
        Assertions.assertThat(result).isEqualTo(3)
    }
}