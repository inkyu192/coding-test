package programmers.fullsearch.level2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("모음 사전")
class VowelDictionaryTest {

    VowelDictionary vowelDictionary = new VowelDictionary();

    @Test
    void testCase1() {
        String word = "AAAAE";

        int expected = 6;

        assertThat(vowelDictionary.solution(word)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        String word = "AAAE";

        int expected = 10;

        assertThat(vowelDictionary.solution(word)).isEqualTo(expected);
    }

    @Test
    void testCase3() {
        String word = "I";

        int expected = 1563;

        assertThat(vowelDictionary.solution(word)).isEqualTo(expected);
    }

    @Test
    void testCase4() {
        String word = "EIO";

        int expected = 1189;

        assertThat(vowelDictionary.solution(word)).isEqualTo(expected);
    }
}