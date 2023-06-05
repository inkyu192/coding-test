package programmers.level_0.basictraining.list;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("홀수 vs 짝수")
class OddVsEvenTest {

    OddVsEven test = new OddVsEven();

    @Test
    void case1() {
        int[] num_list = {4, 2, 6, 1, 7, 6};

        int result = 17;

        assertThat(test.solution(num_list)).isEqualTo(result);
    }

    @Test
    void case2() {
        int[] num_list = {-1, 2, 5, 6, 3};

        int result = 8;

        assertThat(test.solution(num_list)).isEqualTo(result);
    }
}