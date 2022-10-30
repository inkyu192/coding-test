package programmers.introduction.level0;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("k의 개수")
class CountOfKTest {

    CountOfK countOfK = new CountOfK();

    @Test
    void testCase1() {
        int i = 1;
        int j = 13;
        int k = 1;

        int expected = 6;

        assertThat(countOfK.solution(i, j, k)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int i = 10;
        int j = 50;
        int k = 5;

        int expected = 5;

        assertThat(countOfK.solution(i, j, k)).isEqualTo(expected);
    }

    @Test
    void testCase3() {
        int i = 3;
        int j = 10;
        int k = 2;

        int expected = 0;

        assertThat(countOfK.solution(i, j, k)).isEqualTo(expected);
    }
}