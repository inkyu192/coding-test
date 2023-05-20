package programmers.level_0.introduction;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("컨트롤 제트")
class ControlZTest {

    ControlZ test = new ControlZ();

    @Test
    void case1() {
        String s = "1 2 Z 3";

        int result = 4;

        assertThat(test.solution(s)).isEqualTo(result);
    }

    @Test
    void case2() {
        String s = "10 20 30 40";

        int result = 100;

        assertThat(test.solution(s)).isEqualTo(result);
    }

    @Test
    void case3() {
        String s = "10 Z 20 Z 1";

        int result = 1;

        assertThat(test.solution(s)).isEqualTo(result);
    }
}