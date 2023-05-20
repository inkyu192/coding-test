package programmers.level_0.basictraining;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("flag에 따라 다른 값 반환하기")
class ReturnDifferentValuesDependingOnFlagTest {

    ReturnDifferentValuesDependingOnFlag test = new ReturnDifferentValuesDependingOnFlag();

    @Test
    void case1() {
        int a = -4;
        int b = 7;
        boolean flag = true;

        int result = 3;

        assertThat(test.solution(a, b, flag)).isEqualTo(result);
    }

    @Test
    void case2() {
        int a = -4;
        int b = 7;
        boolean flag = false;

        int result = -11;

        assertThat(test.solution(a, b, flag)).isEqualTo(result);
    }
}