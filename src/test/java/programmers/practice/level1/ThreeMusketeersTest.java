package programmers.practice.level1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("삼총사")
class ThreeMusketeersTest {

    ThreeMusketeers threeMusketeers = new ThreeMusketeers();

    @Test
    void testCase1() {
        int[] number = {-2, 3, 0, 2, -5};

        int expected = 2;

        assertThat(threeMusketeers.solution(number)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int[] number = {-3, -2, -1, 0, 1, 2, 3};

        int expected = 5;

        assertThat(threeMusketeers.solution(number)).isEqualTo(expected);
    }

    @Test
    void testCase3() {
        int[] number = {-1, 1, -1, 1};

        int expected = 0;

        assertThat(threeMusketeers.solution(number)).isEqualTo(expected);
    }
}