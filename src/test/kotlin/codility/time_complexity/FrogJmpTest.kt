package codility.time_complexity

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class FrogJmpTest {
    private val frogJmp = FrogJmp()

    @Test
    fun case1() {
        val result = frogJmp.solution(X = 10, Y = 85, D = 30)
        Assertions.assertThat(result).isEqualTo(3)
    }

    @Test
    fun case2() {
        val result = frogJmp.solution(X = 10, Y = 50, D = 10)
        Assertions.assertThat(result).isEqualTo(4)
    }
}