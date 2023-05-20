package programmers.level_0.introduction;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("숫자 찾기")
class FindNumberTest {

    FindNumber test = new FindNumber();

    @Test
    void case1() {
        int num = 29183;
        int k = 1;

        int result = 3;

        assertThat(test.solution(num, k)).isEqualTo(result);
    }

    @Test
    void case2() {
        int num = 232443;
        int k = 4;

        int result = 4;

        assertThat(test.solution(num, k)).isEqualTo(result);
    }

    @Test
    void case3() {
        int num = 123456;
        int k = 7;

        int result = -1;

        assertThat(test.solution(num, k)).isEqualTo(result);
    }
}