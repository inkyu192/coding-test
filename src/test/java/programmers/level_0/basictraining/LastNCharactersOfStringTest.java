package programmers.level_0.basictraining;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("문자열의 뒤의 n글자")
class LastNCharactersOfStringTest {

    LastNCharactersOfString test = new LastNCharactersOfString();

    @Test
    void case1() {
        String my_string = "ProgrammerS123";
        int n = 11;

        String result = "grammerS123";

        assertThat(test.solution(my_string, n)).isEqualTo(result);
    }

    @Test
    void case2() {
        String my_string = "He110W0r1d";
        int n = 5;

        String result = "W0r1d";

        assertThat(test.solution(my_string, n)).isEqualTo(result);
    }
}