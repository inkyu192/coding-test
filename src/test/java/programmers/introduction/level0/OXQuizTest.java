package programmers.introduction.level0;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("OX퀴즈")
class OXQuizTest {

    OXQuiz oxQuiz = new OXQuiz();

    @Test
    void testCase1() {
        String[] quiz = {"3 - 4 = -3", "5 + 6 = 11"};

        String[] expected = {"X", "O"};

        assertThat(oxQuiz.solution(quiz)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        String[] quiz = {"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"};

        String[] expected = {"O", "O", "X", "O"};

        assertThat(oxQuiz.solution(quiz)).isEqualTo(expected);
    }
}