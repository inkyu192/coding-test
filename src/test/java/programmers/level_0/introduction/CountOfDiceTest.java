package programmers.level_0.introduction;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("주사위의 개수")
class CountOfDiceTest {

    CountOfDice test = new CountOfDice();

    @Test
    void case1() {
        int[] box = {1, 1, 1};
        int n = 1;

        int result = 1;

        assertThat(test.solution(box, n)).isEqualTo(result);
    }

    @Test
    void case2() {
        int[] box = {10, 8, 6};
        int n = 3;

        int result = 12;

        assertThat(test.solution(box, n)).isEqualTo(result);
    }
}