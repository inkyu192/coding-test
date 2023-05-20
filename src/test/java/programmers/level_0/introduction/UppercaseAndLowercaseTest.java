package programmers.level_0.introduction;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("대문자와 소문자")
class UppercaseAndLowercaseTest {

    UppercaseAndLowercase test = new UppercaseAndLowercase();

    @Test
    void case1() {
        String my_string = "cccCCC";

        String result = "CCCccc";

        assertThat(test.solution(my_string)).isEqualTo(result);
    }

    @Test
    void case2() {
        String my_string = "abCdEfghIJ";

        String result = "ABcDeFGHij";

        assertThat(test.solution(my_string)).isEqualTo(result);
    }
}