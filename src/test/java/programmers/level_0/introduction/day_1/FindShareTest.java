package programmers.level_0.introduction.day_1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("몫 구하기")
class FindShareTest {

    FindShare test = new FindShare();

    @Test
    void case1() {
        int num1 = 10;
        int num2 = 5;

        int result = 2;

        assertThat(test.solution(num1, num2)).isEqualTo(result);
    }

    @Test
    void case2() {
        int num1 = 7;
        int num2 = 2;

        int result = 3;

        assertThat(test.solution(num1, num2)).isEqualTo(result);
    }
}