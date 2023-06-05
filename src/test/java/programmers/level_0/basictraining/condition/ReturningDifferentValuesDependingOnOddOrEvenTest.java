package programmers.level_0.basictraining.condition;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("홀짝에 따라 다른 값 반환하기")
class ReturningDifferentValuesDependingOnOddOrEvenTest {

    ReturningDifferentValuesDependingOnOddOrEven test = new ReturningDifferentValuesDependingOnOddOrEven();

    @Test
    void case1() {
        int n = 7;

        int result = 16;

        assertThat(test.solution(n)).isEqualTo(result);
    }

    @Test
    void case2() {
        int n = 10;

        int result = 220;

        assertThat(test.solution(n)).isEqualTo(result);
    }
}