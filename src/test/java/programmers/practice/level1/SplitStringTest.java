package programmers.practice.level1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("문자열 나누기")
class SplitStringTest {

    SplitString splitString = new SplitString();

    @Test
    void testCase1() {
        String s = "banana";

        int expected = 3;

        assertThat(splitString.solution(s)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        String s = "abracadabra";

        int expected = 6;

        assertThat(splitString.solution(s)).isEqualTo(expected);
    }

    @Test
    void testCase3() {
        String s = "aaabbaccccabba";

        int expected = 3;

        assertThat(splitString.solution(s)).isEqualTo(expected);
    }
}