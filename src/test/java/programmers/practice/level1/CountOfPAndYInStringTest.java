package programmers.practice.level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("문자열 내 p와 y의 개수")
class CountOfPAndYInStringTest {

    CountOfPAndYInString countOfPAndYInString = new CountOfPAndYInString();

    @Test
    void testCase1() {
        String s = "pPoooyY";

        assertThat(countOfPAndYInString.solution(s)).isTrue();
    }

    @Test
    void testCase2() {
        String s = "Pyy";

        assertThat(countOfPAndYInString.solution(s)).isFalse();
    }

    @Test
    void testCase3() {
        String s = "abcdefg";

        assertThat(countOfPAndYInString.solution(s)).isTrue();
    }
}