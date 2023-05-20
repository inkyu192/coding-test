package programmers.level_0.basictraining;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("문자열의 앞의 n글자")
class FirstNCharactersOfStringTest {

    FirstNCharactersOfString test = new FirstNCharactersOfString();

    @Test
    void case1() {
        String myString = "ProgrammerS123";
        int n = 11;

        String result = "ProgrammerS";

        assertThat(test.solution(myString, n)).isEqualTo(result);
    }


    @Test
    void case2() {
        String myString = "He110W0r1d";
        int n = 5;

        String result = "He110";

        assertThat(test.solution(myString, n)).isEqualTo(result);
    }
}