package programmers.introduction.level0;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("대문자와 소문자")
class UppercaseAndLowercaseTest {

    UppercaseAndLowercase uppercaseAndLowercase = new UppercaseAndLowercase();

    @Test
    void testCase1() {
        String my_string = "cccCCC";

        String expected = "CCCccc";

        assertThat(uppercaseAndLowercase.solution(my_string)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        String my_string = "abCdEfghIJ";

        String expected = "ABcDeFGHij";

        assertThat(uppercaseAndLowercase.solution(my_string)).isEqualTo(expected);
    }
}