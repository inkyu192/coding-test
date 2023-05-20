package programmers.level_0.introduction;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("외계어 사전")
class AlienLanguageDictionaryTest {

    AlienLanguageDictionary test = new AlienLanguageDictionary();

    @Test
    void case1() {
        String[] spell = {"p", "o", "s"};
        String[] dic = {"sod", "eocd", "qixm", "adio", "soo"};

        int result = 2;

        assertThat(test.solution(spell, dic)).isEqualTo(result);
    }

    @Test
    void case2() {
        String[] spell = {"z", "d", "x"};
        String[] dic = {"def", "dww", "dzx", "loveaw"};

        int result = 1;

        assertThat(test.solution(spell, dic)).isEqualTo(result);
    }

    @Test
    void case3() {
        String[] spell = {"s", "o", "m", "d"};
        String[] dic = {"moos", "dzx", "smm", "sunmmo", "som"};

        int result = 2;

        assertThat(test.solution(spell, dic)).isEqualTo(result);
    }
}