package codility.counting_elements

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class FrogRiverOneTest {
    private val frogRiverOne = FrogRiverOne()

    @Test
    fun solution() {
        val result = frogRiverOne.solution(X = 5, A = intArrayOf(1, 3, 1, 4, 2, 3, 5, 4))
        Assertions.assertThat(result).isEqualTo(6)
    }
}