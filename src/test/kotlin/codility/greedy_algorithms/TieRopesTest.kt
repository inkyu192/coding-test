package codility.greedy_algorithms

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class TieRopesTest {
    private val tieRopes = TieRopes()

    @Test
    fun case1() {
        val result = tieRopes.solution(4, intArrayOf(1, 2, 3, 4, 1, 1, 3))
        Assertions.assertThat(result).isEqualTo(3)
    }
}