package programmers.introduction.level0;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("각도기")
class ProtractorTest {

    Protractor protractor = new Protractor();

    @Test
    void testCase1() {
        int angle = 70;

        int expected = 1;

        assertThat(protractor.solution(angle)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int angle = 91;

        int expected = 3;

        assertThat(protractor.solution(angle)).isEqualTo(expected);
    }
    @Test
    void testCase3() {
        int angle = 180;

        int expected = 4;

        assertThat(protractor.solution(angle)).isEqualTo(expected);
    }
}