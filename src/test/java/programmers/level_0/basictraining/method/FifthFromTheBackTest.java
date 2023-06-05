package programmers.level_0.basictraining.method;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("뒤에서 5등 위로")
class FifthFromTheBackTest {

    FifthFromTheBack test = new FifthFromTheBack();

    @Test
    void case1() {
        int[] num_list = {12, 4, 15, 46, 38, 1, 14, 56, 32, 10};

        int[] result = {15, 32, 38, 46, 56};

        assertThat(test.solution(num_list)).isEqualTo(result);
    }
}