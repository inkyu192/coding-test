package codility.leader

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class EquiLeaderTest {
    private val equiLeader = EquiLeader()

    @Test
    fun case1() {
        val result = equiLeader.solution(intArrayOf(4, 3, 4, 4, 4, 2))
        Assertions.assertThat(result).isEqualTo(2)
    }
}