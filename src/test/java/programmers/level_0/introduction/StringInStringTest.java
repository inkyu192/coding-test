package programmers.level_0.introduction;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("문자열안에 문자열")
class StringInStringTest {

    StringInString test = new StringInString();

    @Test
    void case1() {
        String str1 = "ab6CDE443fgh22iJKlmn1o";
        String str2 = "6CD";

        int result = 1;

        assertThat(test.solution(str1, str2)).isEqualTo(result);
    }

    @Test
    void case2() {
        String str1 = "ppprrrogrammers";
        String str2 = "pppp";

        int result = 2;

        assertThat(test.solution(str1, str2)).isEqualTo(result);
    }
}