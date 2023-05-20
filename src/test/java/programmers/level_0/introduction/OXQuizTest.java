package programmers.level_0.introduction;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("OX퀴즈")
class OXQuizTest {

    OXQuiz test = new OXQuiz();

    @Test
    void case1() {
        String[] quiz = {"3 - 4 = -3", "5 + 6 = 11"};

        String[] result = {"X", "O"};

        assertThat(test.solution(quiz)).isEqualTo(result);
    }

    @Test
    void case2() {
        String[] quiz = {"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"};

        String[] result = {"O", "O", "X", "O"};

        assertThat(test.solution(quiz)).isEqualTo(result);
    }
}