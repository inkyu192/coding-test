package codility.stacks_and_queues

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class NestingTest {
    private val nesting = Nesting()

    @Test
    fun case1() {
        val result = nesting.solution("(()(())())")
        Assertions.assertThat(result).isEqualTo(1)
    }

    @Test
    fun case2() {
        val result = nesting.solution("())")
        Assertions.assertThat(result).isEqualTo(0)
    }

    @Test
    fun case3() {
        val result = nesting.solution(")(()(())())")
        Assertions.assertThat(result).isEqualTo(0)
    }
}