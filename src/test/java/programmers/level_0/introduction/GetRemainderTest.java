package programmers.level_0.introduction;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("나머지 구하기")
class GetRemainderTest {

    GetRemainder test = new GetRemainder();

    @Test
    void case1() {
        int num1 = 3;
        int num2 = 2;

        int result = 1;

        assertThat(test.solution(num1, num2)).isEqualTo(result);
    }

    @Test
    void case2() {
        int num1 = 10;
        int num2 = 5;

        int result = 0;

        assertThat(test.solution(num1, num2)).isEqualTo(result);
    }
}