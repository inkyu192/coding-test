package programmers.practice.level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("문자열 다루기 기본")
class StringHandlingBasicTest {

    StringHandlingBasic stringHandlingBasic = new StringHandlingBasic();

    @Test
    void testCase1() {
        String s = "a234";

        assertThat(stringHandlingBasic.solution(s)).isFalse();
    }

    @Test
    void testCase2() {
        String s = "1234";

        assertThat(stringHandlingBasic.solution(s)).isTrue();
    }
}