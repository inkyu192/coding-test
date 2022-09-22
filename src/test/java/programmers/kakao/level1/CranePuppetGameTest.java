package programmers.kakao.level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("크레인 인형뽑기 게임")
class CranePuppetGameTest {

    CranePuppetGame cranePuppetGame = new CranePuppetGame();

    @Test
    void testCase1() {
        int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3,}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};
        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};

        int expected = 4;

        assertThat(cranePuppetGame.solution(board, moves)).isEqualTo(expected);
    }
}