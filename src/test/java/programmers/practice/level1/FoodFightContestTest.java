package programmers.practice.level1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("푸드 파이트 대회")
class FoodFightContestTest {

    FoodFightContest foodFightContest = new FoodFightContest();

    @Test
    void testCase1() {
        int[] food = {1, 3, 4, 6};

        String expected = "1223330333221";

        assertThat(foodFightContest.solution(food)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int[] food = {1, 7, 1, 2};

        String expected = "111303111";

        assertThat(foodFightContest.solution(food)).isEqualTo(expected);
    }
}