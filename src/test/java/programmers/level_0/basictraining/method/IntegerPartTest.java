package programmers.level_0.basictraining.method;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("정수 부분")
class IntegerPartTest {

    IntegerPart test = new IntegerPart();

    @Test
    void case1() {
        double flo = 1.42;

        int result = 1;

        assertThat(test.solution(flo)).isEqualTo(result);
    }

    @Test
    void case2() {
        double flo = 69.32;

        int result = 69;

        assertThat(test.solution(flo)).isEqualTo(result);
    }
}