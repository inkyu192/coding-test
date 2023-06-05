package programmers.level_0.basictraining.list;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("첫 번째로 나오는 음수")
class FirstNegativeNumberTest {

    FirstNegativeNumber test = new FirstNegativeNumber();

    @Test
    void case1() {
        int[] num_list = {12, 4, 15, 46, 38, -2, 15};

        int result = 5;

        assertThat(test.solution(num_list)).isEqualTo(result);
    }

    @Test
    void case2() {
        int[] num_list = {13, 22, 53, 24, 15, 6};

        int result = -1;

        assertThat(test.solution(num_list)).isEqualTo(result);
    }
}