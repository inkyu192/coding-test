package codility.iterations

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class BinaryGapTest {
    private val binaryGap = BinaryGap()

    @Test
    fun case1() {
        val result = binaryGap.solution(N = 1041)
        Assertions.assertThat(result).isEqualTo(5)
    }

    @Test
    fun case2() {
        val result = binaryGap.solution(N = 32)
        Assertions.assertThat(result).isEqualTo(0)
    }
}