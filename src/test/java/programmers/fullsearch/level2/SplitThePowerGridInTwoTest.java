package programmers.fullsearch.level2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("전력망을 둘로 나누기")
class SplitThePowerGridInTwoTest {

    SplitThePowerGridInTwo splitThePowerGridInTwo = new SplitThePowerGridInTwo();

    @Test
    void testCase1() {
        int n = 9;
        int[][] wires = {{1, 3}, {2, 3}, {3, 4}, {4, 5}, {4, 6}, {4, 7}, {7, 8}, {7, 9}};

        int result = 3;

        assertThat(splitThePowerGridInTwo.solution(n, wires)).isEqualTo(result);
    }

    @Test
    void testCase2() {
        int n = 4;
        int[][] wires = {{1, 2}, {2, 3}, {3, 4}};

        int result = 0;

        assertThat(splitThePowerGridInTwo.solution(n, wires)).isEqualTo(result);
    }

    @Test
    void testCase3() {
        int n = 7;
        int[][] wires = {{1, 2}, {2, 7}, {3, 7}, {3, 4}, {4, 5}, {6, 7}};

        int result = 1;

        assertThat(splitThePowerGridInTwo.solution(n, wires)).isEqualTo(result);
    }
}