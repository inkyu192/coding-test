package programmers.introduction.level0;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("컨트롤 제트")
class ControlZTest {

    ControlZ controlZ = new ControlZ();

    @Test
    void testCase1() {
        String s = "1 2 Z 3";

        int expected = 4;

        assertThat(controlZ.solution(s)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        String s = "10 20 30 40";

        int expected = 100;

        assertThat(controlZ.solution(s)).isEqualTo(expected);
    }

    @Test
    void testCase3() {
        String s = "10 Z 20 Z 1";

        int expected = 1;

        assertThat(controlZ.solution(s)).isEqualTo(expected);
    }
}