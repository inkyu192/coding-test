package programmers.level_0.introduction;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("짝수의 합")
class SumOfEvenTest {

    SumOfEven test = new SumOfEven();

    @Test
    void case1() {
        int n = 10;

        int result = 30;

        assertThat(test.solution(n)).isEqualTo(result);
    }


    @Test
    void case2() {
        int n = 4;

        int result = 6;

        assertThat(test.solution(n)).isEqualTo(result);
    }
}