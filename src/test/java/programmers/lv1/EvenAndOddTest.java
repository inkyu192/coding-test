package programmers.lv1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("짝수와 홀수")
class EvenAndOddTest {

    EvenAndOdd evenAndOdd = new EvenAndOdd();

    @Test
    void testCase1() {
        int num = 3;
        String answer = evenAndOdd.solution(num);

        String expected = "Odd";

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int num = 4;
        String answer = evenAndOdd.solution(num);

        String expected = "Even";

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    void testCase3() {
        int num = 0;
        String answer = evenAndOdd.solution(num);

        String expected = "Even";

        assertThat(answer).isEqualTo(expected);
    }
}