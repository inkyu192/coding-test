package programmers.dfsbfs.level2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("게임 맵 최단거리")
class ShortestDistanceOnTheGameMapTest {

    ShortestDistanceOnTheGameMap shortestDistanceOnTheGameMap = new ShortestDistanceOnTheGameMap();

    @Test
    void testCase1() {
        int[][] maps = {{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 1}, {0, 0, 0, 0, 1}};

        int expected = 11;

        assertThat(shortestDistanceOnTheGameMap.solution(maps)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int[][] maps = {{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 0}, {0, 0, 0, 0, 1}};

        int expected = -1;

        assertThat(shortestDistanceOnTheGameMap.solution(maps)).isEqualTo(expected);
    }
}