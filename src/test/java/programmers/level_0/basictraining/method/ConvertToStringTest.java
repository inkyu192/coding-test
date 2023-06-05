package programmers.level_0.basictraining.method;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("문자열로 변환")
class ConvertToStringTest {

    ConvertToString test = new ConvertToString();

    @Test
    void case1() {
        int n = 123;

        String result = "123";

        assertThat(test.solution(n)).isEqualTo(result);
    }

    @Test
    void case2() {
        int n = 2573;

        String result = "2573";

        assertThat(test.solution(n)).isEqualTo(result);
    }
}