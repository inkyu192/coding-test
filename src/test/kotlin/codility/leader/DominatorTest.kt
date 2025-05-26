package codility.leader

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class DominatorTest {
    private val dominator = Dominator()

    @Test
    fun case1() {
        val result = dominator.solution(intArrayOf(3, 4, 3, 2, 3, -1, 3, 3))
        Assertions.assertThat(result).isIn(0, 2, 4, 6, 7)
    }
}