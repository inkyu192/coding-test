package programmers.level_0.basictraining;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("소문자로 바꾸기")
class ToLowerCaseTest {

    ToLowerCase test = new ToLowerCase();

    @Test
    void case1() {
        String myString = "aBcDeFg";
        String result = "abcdefg";

        assertThat(test.solution(myString)).isEqualTo(result);
    }

    @Test
    void case2() {
        String myString = "aaa";
        String result = "aaa";

        assertThat(test.solution(myString)).isEqualTo(result);
    }
}