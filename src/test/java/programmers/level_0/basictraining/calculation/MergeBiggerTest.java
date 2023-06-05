package programmers.level_0.basictraining.calculation;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("더 크게 합치기")
class MergeBiggerTest {

    MergeBigger test = new MergeBigger();

    @Test
    void case1() {
        int a = 9;
        int b = 91;

        int result = 991;

        assertThat(test.solution(a, b)).isEqualTo(result);
    }

    @Test
    void case2() {
        int a = 89;
        int b = 8;

        int result = 898;

        assertThat(test.solution(a, b)).isEqualTo(result);
    }
}