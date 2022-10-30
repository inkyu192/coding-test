package programmers.introduction.level0;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("캐릭터의 좌표")
class CoordinateOfCharacterTest {

    CoordinateOfCharacter coordinateOfCharacter = new CoordinateOfCharacter();

    @Test
    void testCase1() {
        String[] keyinput = {"left", "right", "up", "right", "right"};
        int[] board = {11, 11};

        int[] expected = {2, 1};

        assertThat(coordinateOfCharacter.solution(keyinput, board)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        String[] keyinput = {"down", "down", "down", "down", "down"};
        int[] board = {7, 9};

        int[] expected = {0, -4};

        assertThat(coordinateOfCharacter.solution(keyinput, board)).isEqualTo(expected);
    }
}