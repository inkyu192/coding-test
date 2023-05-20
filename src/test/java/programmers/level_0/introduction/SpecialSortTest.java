package programmers.level_0.introduction;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("특이한 정렬")
class SpecialSortTest {

    SpecialSort test = new SpecialSort();

    @Test
    void case1() {
        int[] numlist = {1, 2, 3, 4, 5, 6};
        int n = 4;

        int[] result = {4, 5, 3, 6, 2, 1};

        assertThat(test.solution(numlist, n)).isEqualTo(result);
    }

    @Test
    void case2() {
        int[] numlist = {10000, 20, 36, 47, 40, 6, 10, 7000};
        int n = 30;

        int[] result = {36, 40, 20, 47, 10, 6, 7000, 10000};

        assertThat(test.solution(numlist, n)).isEqualTo(result);
    }
}