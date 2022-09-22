package programmers.greedy.level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("체육복")
class GymSuitTest {

    GymSuit gymSuit = new GymSuit();

    @Test
    void testCase1() {
        int n = 5;
        int[] lost = {2, 4};
        int[] reserve = {1, 3, 5};

        int expected = 5;

        assertThat(gymSuit.solution(n, lost, reserve)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int n = 5;
        int[] lost = {2, 4};
        int[] reserve = {3};

        int expected = 4;

        assertThat(gymSuit.solution(n, lost, reserve)).isEqualTo(expected);
    }

    @Test
    void testCase3() {
        int n = 3;
        int[] lost = {3};
        int[] reserve = {1};

        int expected = 2;

        assertThat(gymSuit.solution(n, lost, reserve)).isEqualTo(expected);
    }
}