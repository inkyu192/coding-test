package codility.greedy_algorithms

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class MaxNonoverlappingSegmentsTest {
    private val maxNonoverlappingSegments = MaxNonoverlappingSegments()

    @Test
    fun case1() {
        val result = maxNonoverlappingSegments.solution(intArrayOf(1, 3, 7, 9, 9), intArrayOf(5, 6, 8, 9, 10))
        Assertions.assertThat(result).isEqualTo(3)
    }
}