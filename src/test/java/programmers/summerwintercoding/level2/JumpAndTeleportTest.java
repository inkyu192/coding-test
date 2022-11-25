package programmers.summerwintercoding.level2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("점프와 순간 이동")
class JumpAndTeleportTest {

    JumpAndTeleport jumpAndTeleport = new JumpAndTeleport();

    @Test
    void testCase1() {
        int n = 5;

        int expected = 2;

        assertThat(jumpAndTeleport.solution(n)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int n = 6;

        int expected = 2;

        assertThat(jumpAndTeleport.solution(n)).isEqualTo(expected);
    }

    @Test
    void testCase3() {
        int n = 5000;

        int expected = 5;

        assertThat(jumpAndTeleport.solution(n)).isEqualTo(expected);
    }
}