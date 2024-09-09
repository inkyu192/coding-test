package programmers.level_0.introduction.day_2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("분수의 덧셈")
class SumOfFractionsTest {

    SumOfFractions test = new SumOfFractions();

    @Test
    void case1() {
        int denum1 = 1;
        int num1 = 2;
        int denum2 = 3;
        int num2 = 4;

        int[] result = {5, 4};

        assertThat(test.solution(denum1, num1, denum2, num2)).isEqualTo(result);
    }

    @Test
    void case2() {
        int denum1 = 9;
        int num1 = 2;
        int denum2 = 1;
        int num2 = 3;

        int[] result = {29, 6};

        assertThat(test.solution(denum1, num1, denum2, num2)).isEqualTo(result);
    }
}