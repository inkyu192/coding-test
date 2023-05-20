package programmers.level_0.introduction;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("약수 구하기")
class GetDivisorTest {

    GetDivisor test = new GetDivisor();

    @Test
    void case1() {
        int n = 24;

        int[] result = {1, 2, 3, 4, 6, 8, 12, 24};

        assertThat(test.solution(n)).isEqualTo(result);
    }

    @Test
    void case2() {
        int n = 29;

        int[] result = {1, 29};

        assertThat(test.solution(n)).isEqualTo(result);
    }
}