package programmers.level_0.basictraining.method;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("뒤에서 5등까지")
class FromBackToFifthTest {

    FromBackToFifth test = new FromBackToFifth();

    @Test
    void case1() {
        int[] num_list = {12, 4, 15, 46, 38, 1, 14};

        int[] result = {1, 4, 12, 14, 15};

        assertThat(test.solution(num_list)).isEqualTo(result);
    }
}