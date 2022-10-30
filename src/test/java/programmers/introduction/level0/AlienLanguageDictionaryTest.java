package programmers.introduction.level0;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("외계어 사전")
class AlienLanguageDictionaryTest {

    AlienLanguageDictionary alienLanguageDictionary = new AlienLanguageDictionary();

    @Test
    void testCase1() {
        String[] spell = {"p", "o", "s"};
        String[] dic = {"sod", "eocd", "qixm", "adio", "soo"};

        int expected = 2;

        assertThat(alienLanguageDictionary.solution(spell, dic)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        String[] spell = {"z", "d", "x"};
        String[] dic = {"def", "dww", "dzx", "loveaw"};

        int expected = 1;

        assertThat(alienLanguageDictionary.solution(spell, dic)).isEqualTo(expected);
    }

    @Test
    void testCase3() {
        String[] spell = {"s", "o", "m", "d"};
        String[] dic = {"moos", "dzx", "smm", "sunmmo", "som"};

        int expected = 2;

        assertThat(alienLanguageDictionary.solution(spell, dic)).isEqualTo(expected);
    }
}