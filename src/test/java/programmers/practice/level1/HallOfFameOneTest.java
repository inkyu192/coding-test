package programmers.practice.level1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("명예의 전당 (1)")
class HallOfFameOneTest {

    HallOfFameOne hallOfFameOne = new HallOfFameOne();

    @Test
    void testCase1() {
        int k = 3;
        int[] score = {10, 100, 20, 150, 1, 100, 200};

        int[] expected = {10, 10, 10, 20, 20, 100, 100};

        assertThat(hallOfFameOne.solution(k, score)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int k = 4;
        int[] score = {0, 300, 40, 300, 20, 70, 150, 50, 500, 1000};

        int[] expected = {0, 0, 0, 0, 20, 40, 70, 70, 150, 300};

        assertThat(hallOfFameOne.solution(k, score)).isEqualTo(expected);
    }
}