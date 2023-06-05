package programmers.level_0.basictraining.method;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("문자열을 정수로 변환하기")
class ConvertStringToIntegerTest {

    ConvertStringToInteger test = new ConvertStringToInteger();

    @Test
    void case1() {
        String n_str = "10";

        int result = 10;

        assertThat(test.solution(n_str)).isEqualTo(result);
    }

    @Test
    void case2() {
        String n_str = "8542";

        int result = 8542;

        assertThat(test.solution(n_str)).isEqualTo(result);
    }
}