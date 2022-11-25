package programmers.practice.level2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("멀리 뛰기")
class LongJumpTest {

    LongJump longJump = new LongJump();

    @Test
    void testCase1() {
        int n = 4;

        long expected = 5;

        assertThat(longJump.solution(n)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int n = 3;

        long expected = 3;

        assertThat(longJump.solution(n)).isEqualTo(expected);
    }
}