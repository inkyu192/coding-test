package programmers.introduction.level0;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("모음 제거")
class RemoveVowelTest {

    RemoveVowel removeVowel = new RemoveVowel();

    @Test
    void testCase1() {
        String my_string = "bus";

        String expected = "bs";

        assertThat(removeVowel.solution(my_string)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        String my_string = "nice to meet you";

        String expected = "nc t mt y";

        assertThat(removeVowel.solution(my_string)).isEqualTo(expected);
    }
}