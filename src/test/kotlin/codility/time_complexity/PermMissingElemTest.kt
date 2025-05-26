package codility.time_complexity

import org.assertj.core.api.Assertions
import kotlin.test.Test

class PermMissingElemTest {
    private val permMissingElem = PermMissingElem()

    @Test
    fun case1() {
        val result = permMissingElem.solution(A = intArrayOf(2, 3, 1, 5))
        Assertions.assertThat(result).isEqualTo(4)
    }
}