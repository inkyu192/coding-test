package programmers.introduction.level0;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("특정 문자 제거하기")
class RemoveSpecificStringTest {

    RemoveSpecificString removeSpecificString = new RemoveSpecificString();

    @Test
    void testCase1() {
        String my_string = "abcdef";
        String letter = "f";

        String expected = "abcde";

        assertThat(removeSpecificString.solution(my_string, letter)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        String my_string = "BCBdbe";
        String letter = "B";

        String expected = "Cdbe";

        assertThat(removeSpecificString.solution(my_string, letter)).isEqualTo(expected);
    }
}