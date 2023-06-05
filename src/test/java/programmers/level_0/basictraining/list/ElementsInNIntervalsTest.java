package programmers.level_0.basictraining.list;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("n개 간격의 원소들")
class ElementsInNIntervalsTest {

    ElementsInNIntervals test = new ElementsInNIntervals();

    @Test
    void case1() {
        int[] num_list = {4, 2, 6, 1, 7, 6};
        int n = 2;

        int[] result = {4, 6, 7};

        assertThat(test.solution(num_list, n)).isEqualTo(result);
    }

    @Test
    void case2() {
        int[] num_list = {4, 2, 6, 1, 7, 6};
        int n = 4;

        int[] result = {4, 7};

        assertThat(test.solution(num_list, n)).isEqualTo(result);
    }
}