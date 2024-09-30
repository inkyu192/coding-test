package programmers.level_1.practice;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("약수의 합")
class SumOfDivisorsTest {

    SumOfDivisors sumOfDivisors;

    @BeforeEach
    void beforeEach() {
        sumOfDivisors = new SumOfDivisors();
    }

    @Test
    void case1() {
        int n = 12;
        int expected = 28;

        Assertions.assertThat(sumOfDivisors.solution(n)).isEqualTo(expected);
    }

    @Test
    void case2() {
        int n = 5;
        int expected = 6;

        Assertions.assertThat(sumOfDivisors.solution(n)).isEqualTo(expected);
    }
}