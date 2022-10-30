package programmers.introduction.level0;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("중앙값 구하기")
class FindMedianTest {

    FindMedian findMedian = new FindMedian();

    @Test
    void testCase1() {
        int[] array = {1, 2, 7, 10, 11};

        int expected = 7;

        assertThat(findMedian.solution(array)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int[] array = {9, -1, 0};

        int expected = 0;

        assertThat(findMedian.solution(array)).isEqualTo(expected);
    }
}