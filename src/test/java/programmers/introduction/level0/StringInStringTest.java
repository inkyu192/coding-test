package programmers.introduction.level0;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("문자열안에 문자열")
class StringInStringTest {

    StringInString stringInString = new StringInString();

    @Test
    void testCase1() {
        String str1 = "ab6CDE443fgh22iJKlmn1o";
        String str2 = "6CD";

        int expected = 1;

        assertThat(stringInString.solution(str1, str2)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        String str1 = "ppprrrogrammers";
        String str2 = "pppp";

        int expected = 2;

        assertThat(stringInString.solution(str1, str2)).isEqualTo(expected);
    }
}