package programmers.practice.level1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("크기가 작은 부분문자열")
class SmallSubstringTest {

    SmallSubstring smallSubstring = new SmallSubstring();

    @Test
    void testCase1() {
        String t = "3141592";
        String p = "271";

        int expected = 2;

        assertThat(smallSubstring.solution(t, p)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        String t = "500220839878";
        String p = "7";

        int expected = 8;

        assertThat(smallSubstring.solution(t, p)).isEqualTo(expected);
    }

    @Test
    void testCase3() {
        String t = "10203";
        String p = "15";

        int expected = 3;

        assertThat(smallSubstring.solution(t, p)).isEqualTo(expected);
    }
}