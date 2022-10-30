package programmers.introduction.level0;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("주사위의 개수")
class CountOfDiceTest {

    CountOfDice countOfDice = new CountOfDice();

    @Test
    void testCase1() {
        int[] box = {1, 1, 1};
        int n = 1;

        int expected = 1;

        assertThat(countOfDice.solution(box, n)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int[] box = {10, 8, 6};
        int n = 3;

        int expected = 12;

        assertThat(countOfDice.solution(box, n)).isEqualTo(expected);
    }
}