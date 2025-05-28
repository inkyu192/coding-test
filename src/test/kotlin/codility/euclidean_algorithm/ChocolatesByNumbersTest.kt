package codility.euclidean_algorithm

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class ChocolatesByNumbersTest {
    private val chocolatesByNumbers = ChocolatesByNumbers()

    @Test
    fun case1() {
        val result = chocolatesByNumbers.solution(10, 4)
        Assertions.assertThat(result).isEqualTo(5)
    }
}