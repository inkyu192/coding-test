package programmers.level_0.introduction;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("등수 매기기")
class RankingTest {

    Ranking test = new Ranking();

    @Test
    void case1() {
        int[][] score = {{80, 70}, {90, 50}, {40, 70}, {50, 80}};

        int[] result = {1, 2, 4, 3};

        assertThat(test.solution(score)).isEqualTo(result);
    }

    @Test
    void case2() {
        int[][] score = {{80, 70}, {70, 80}, {30, 50}, {90, 100}, {100, 90}, {100, 100}, {10, 30}};

        int[] result = {4, 4, 6, 2, 2, 1, 7};

        assertThat(test.solution(score)).isEqualTo(result);
    }
}