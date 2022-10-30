package programmers.introduction.level0;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("짝수의 합")
class SumOfEvenTest {

    SumOfEven sumOfEven = new SumOfEven();

    @Test
    void testCase1() {
        int n = 10;

        int expected = 30;

        assertThat(sumOfEven.solution(n)).isEqualTo(expected);
    }


    @Test
    void testCase2() {
        int n = 4;

        int expected = 6;

        assertThat(sumOfEven.solution(n)).isEqualTo(expected);
    }
}