package programmers.introduction.level0;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("등수 매기기")
class RankingTest {

    Ranking ranking = new Ranking();

    @Test
    void testCase1() {
        int[][] score = {{80, 70}, {90, 50}, {40, 70}, {50, 80}};

        int[] expected = {1, 2, 4, 3};

        assertThat(ranking.solution(score)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int[][] score = {{80, 70}, {70, 80}, {30, 50}, {90, 100}, {100, 90}, {100, 100}, {10, 30}};

        int[] expected = {4, 4, 6, 2, 2, 1, 7};

        assertThat(ranking.solution(score)).isEqualTo(expected);
    }
}