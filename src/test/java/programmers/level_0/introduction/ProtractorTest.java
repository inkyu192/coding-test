package programmers.level_0.introduction;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("각도기")
class ProtractorTest {

    Protractor test = new Protractor();

    @Test
    void case1() {
        int angle = 70;

        int result = 1;

        assertThat(test.solution(angle)).isEqualTo(result);
    }

    @Test
    void case2() {
        int angle = 91;

        int result = 3;

        assertThat(test.solution(angle)).isEqualTo(result);
    }
    @Test
    void case3() {
        int angle = 180;

        int result = 4;

        assertThat(test.solution(angle)).isEqualTo(result);
    }
}