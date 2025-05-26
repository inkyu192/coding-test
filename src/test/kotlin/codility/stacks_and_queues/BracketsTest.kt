package codility.stacks_and_queues

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class BracketsTest {
    private val brackets = Brackets()

    @Test
    fun case1() {
        val result = brackets.solution("{[()()]}")
        Assertions.assertThat(result).isEqualTo(1)
    }

    @Test
    fun case2() {
        val result = brackets.solution("([)()]")
        Assertions.assertThat(result).isEqualTo(0)
    }
}