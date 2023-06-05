package programmers.level_0.basictraining.method;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("문자열 정수의 합")
class SumOfStringIntegersTest {

    SumOfStringIntegers test = new SumOfStringIntegers();

    @Test
    void case1() {
        String num_str = "123456789";

        int result = 45;

        assertThat(test.solution(num_str)).isEqualTo(result);
    }

    @Test
    void case2() {
        String num_str = "1000000";

        int result = 1;

        assertThat(test.solution(num_str)).isEqualTo(result);
    }
}