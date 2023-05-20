package programmers.level_0.introduction;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("캐릭터의 좌표")
class CoordinateOfCharacterTest {

    CoordinateOfCharacter test = new CoordinateOfCharacter();

    @Test
    void case1() {
        String[] keyinput = {"left", "right", "up", "right", "right"};
        int[] board = {11, 11};

        int[] result = {2, 1};

        assertThat(test.solution(keyinput, board)).isEqualTo(result);
    }

    @Test
    void case2() {
        String[] keyinput = {"down", "down", "down", "down", "down"};
        int[] board = {7, 9};

        int[] result = {0, -4};

        assertThat(test.solution(keyinput, board)).isEqualTo(result);
    }
}