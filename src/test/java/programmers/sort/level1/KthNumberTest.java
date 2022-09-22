package programmers.sort.level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("K번째수")
class KthNumberTest {

    KthNumber kthNumber = new KthNumber();

    @Test
    void testCase1() {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        int[] expected = {5, 6, 3};

        assertThat(kthNumber.solution(array, commands)).isEqualTo(expected);
    }
}