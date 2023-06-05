package programmers.level_0.basictraining.string;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("대문자로 바꾸기")
class ToUpperCaseTest {

    ToUpperCase test = new ToUpperCase();

    @Test
    void case1() {
        String myString = "aBcDeFg";

        String result = "ABCDEFG";

        assertThat(test.solution(myString)).isEqualTo(result);
    }

    @Test
    void case2() {
        String myString = "AAA";

        String result = "AAA";

        assertThat(test.solution(myString)).isEqualTo(result);
    }
}