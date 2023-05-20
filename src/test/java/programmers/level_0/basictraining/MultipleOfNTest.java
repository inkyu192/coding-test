package programmers.level_0.basictraining;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("n의 배수")
class MultipleOfNTest {

    MultipleOfN test = new MultipleOfN();

    @Test
    void case1() {
        int num = 98;
        int n = 2;

        int result = 1;

        assertThat(test.solution(num, n)).isEqualTo(result);
    }
    @Test
    void case2() {
        int num = 34;
        int n = 3;

        int result = 0;

        assertThat(test.solution(num, n)).isEqualTo(result);
    }
}