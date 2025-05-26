package codility.time_complexity

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class TapeEquilibriumTest {
    private val tapeEquilibrium = TapeEquilibrium()

    @Test
    fun case1() {
        val result = tapeEquilibrium.solution(A = intArrayOf(3, 1, 2, 4, 3))
        Assertions.assertThat(result).isEqualTo(1)
    }
}