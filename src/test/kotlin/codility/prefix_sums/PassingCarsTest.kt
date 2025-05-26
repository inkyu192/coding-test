package codility.prefix_sums

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class PassingCarsTest {
    private val passingCars = PassingCars()

    @Test
    fun case1() {
        val result = passingCars.solution(A = intArrayOf(0, 1, 0, 1, 1))
        Assertions.assertThat(result).isEqualTo(5)
    }
}