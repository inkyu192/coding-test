package programmers.level_0.basictraining;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("공배수")
class CommonMultipleTest {

    CommonMultiple test = new CommonMultiple();

    @Test
    void case1() {
        int number = 60;
        int n = 2;
        int m = 3;

        int result = 1;

        assertThat(test.solution(number, n, m)).isEqualTo(result);
    }

    @Test
    void case2() {
        int number = 55;
        int n = 10;
        int m = 5;

        int result = 0;

        assertThat(test.solution(number, n, m)).isEqualTo(result);
    }
}