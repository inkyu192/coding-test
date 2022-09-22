package programmers.devmatching.level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("로또의 최고 순위와 최저 순위")
class TheHighestAndLowestRanksOfTheLotteryTest {

    TheHighestAndLowestRanksOfTheLottery theHighestAndLowestRanksOfTheLottery = new TheHighestAndLowestRanksOfTheLottery();

    @Test
    void testCase1() {
        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};

        int[] result = {3, 5};

        assertThat(theHighestAndLowestRanksOfTheLottery.solution(lottos, win_nums)).isEqualTo(result);
    }

    @Test
    void testCase2() {
        int[] lottos = {0, 0, 0, 0, 0, 0};
        int[] win_nums = {38, 19, 20, 40, 15, 25};

        int[] result = {1, 6};

        assertThat(theHighestAndLowestRanksOfTheLottery.solution(lottos, win_nums)).isEqualTo(result);
    }

    @Test
    void testCase3() {
        int[] lottos = {45, 4, 35, 20, 3, 9};
        int[] win_nums = {20, 9, 3, 45, 4, 35};

        int[] result = {1, 1};

        assertThat(theHighestAndLowestRanksOfTheLottery.solution(lottos, win_nums)).isEqualTo(result);
    }
}