package codility.maximum_slice_problem

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class MaxProfitTest {
    private val maxProfit = MaxProfit()

    @Test
    fun case1() {
        val result = maxProfit.solution(intArrayOf(23171, 21011, 21123, 21366, 21013, 21367))
        Assertions.assertThat(result).isEqualTo(356)
    }

    @Test
    fun case2() {
        val result = maxProfit.solution(intArrayOf(5, 4, 3, 2, 1))
        Assertions.assertThat(result).isEqualTo(0)
    }
}