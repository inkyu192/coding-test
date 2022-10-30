package programmers.introduction.level0;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("특이한 정렬")
class SpecialSortTest {

    SpecialSort specialSort = new SpecialSort();

    @Test
    void testCase1() {
        int[] numlist = {1, 2, 3, 4, 5, 6};
        int n = 4;

        int[] expected = {4, 5, 3, 6, 2, 1};

        assertThat(specialSort.solution(numlist, n)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int[] numlist = {10000, 20, 36, 47, 40, 6, 10, 7000};
        int n = 30;

        int[] expected = {36, 40, 20, 47, 10, 6, 7000, 10000};

        assertThat(specialSort.solution(numlist, n)).isEqualTo(expected);
    }
}