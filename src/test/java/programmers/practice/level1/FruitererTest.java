package programmers.practice.level1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("과일 장수")
class FruitererTest {

    Fruiterer fruiterer = new Fruiterer();

    @Test
    void testCase1() {
        int k = 3;
        int m = 4;
        int[] score = {1, 2, 3, 1, 2, 3, 1};

        int expected = 8;

        assertThat(fruiterer.solution(k, m, score)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int k = 4;
        int m = 3;
        int[] score = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};

        int expected = 33;

        assertThat(fruiterer.solution(k, m, score)).isEqualTo(expected);
    }
}