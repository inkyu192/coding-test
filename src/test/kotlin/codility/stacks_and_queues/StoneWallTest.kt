package codility.stacks_and_queues

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class StoneWallTest {
    private val stoneWall = StoneWall()

    @Test
    fun case1() {
        val result = stoneWall.solution(intArrayOf(8, 8, 5, 7, 9, 8, 7, 4, 8))
        Assertions.assertThat(result).isEqualTo(7)
    }
}