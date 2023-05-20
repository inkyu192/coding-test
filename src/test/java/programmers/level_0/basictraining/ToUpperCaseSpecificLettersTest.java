package programmers.level_0.basictraining;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("특정한 문자를 대문자로 바꾸기")
class ToUpperCaseSpecificLettersTest {

    ToUpperCaseSpecificLetters test = new ToUpperCaseSpecificLetters();

    @Test
    void case1() {
        String my_string = "programmers";
        String alp = "p";

        String result = "Programmers";

        assertThat(test.solution(my_string, alp)).isEqualTo(result);
    }


    @Test
    void case2() {
        String my_string = "lowercase";
        String alp = "x";

        String result = "lowercase";

        assertThat(test.solution(my_string, alp)).isEqualTo(result);
    }
}