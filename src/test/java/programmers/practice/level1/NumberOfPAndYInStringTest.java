package programmers.practice.level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("문자열 내 p와 y의 개수")
class NumberOfPAndYInStringTest {

    NumberOfPAndYInString numberOfPAndYInString = new NumberOfPAndYInString();

    @Test
    void testCase1() {
        String s = "pPoooyY";

        assertThat(numberOfPAndYInString.solution(s)).isTrue();
    }

    @Test
    void testCase2() {
        String s = "Pyy";

        assertThat(numberOfPAndYInString.solution(s)).isFalse();
    }
}