package codility.stacks_and_queues

import org.assertj.core.api.Assertions
import kotlin.test.Test

class FishTest {
    private val fish = Fish()

    @Test
    fun case1() {
        val result = fish.solution(intArrayOf(4, 3, 2, 1, 5), intArrayOf(0, 1, 0, 0, 0))
        Assertions.assertThat(result).isEqualTo(2)
    }
}