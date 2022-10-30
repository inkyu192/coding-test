package programmers.introduction.level0;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("짝수 홀수 개수")
class CountEvenOddTest {

    CountEvenOdd countEvenOdd = new CountEvenOdd();

    @Test
    void testCase1() {
        int[] num_list = {1, 2, 3, 4, 5};

        int[] expected = {2, 3};

        assertThat(countEvenOdd.solution(num_list)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int[] num_list = {1, 3, 5, 7};

        int[] expected = {0, 4};

        assertThat(countEvenOdd.solution(num_list)).isEqualTo(expected);
    }
}