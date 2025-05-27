package codility.maximum_slice_problem

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class MaxSliceSumTest {
    private val maxSliceSum = MaxSliceSum()

    @Test
    fun case1() {
        val result = maxSliceSum.solution(intArrayOf(3, 2, -6, 4, 0))
        Assertions.assertThat(result).isEqualTo(5)
    }
}