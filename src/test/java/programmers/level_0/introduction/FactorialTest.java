package programmers.level_0.introduction;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("팩토리얼")
class FactorialTest {

    Factorial test = new Factorial();

    @Test
    void case1() {
        int n = 3628800;

        int result = 10;

        assertThat(test.solution(n)).isEqualTo(result);
    }

    @Test
    void case2() {
        int n = 7;

        int result = 3;

        assertThat(test.solution(n)).isEqualTo(result);
    }
}