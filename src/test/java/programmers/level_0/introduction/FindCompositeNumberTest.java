package programmers.level_0.introduction;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("합성수 찾기")
class FindCompositeNumberTest {

    FindCompositeNumber test = new FindCompositeNumber();

    @Test
    void case1() {
        int n = 10;

        int result = 5;

        assertThat(test.solution(n)).isEqualTo(result);
    }

    @Test
    void case2() {
        int n = 15;

        int result = 8;

        assertThat(test.solution(n)).isEqualTo(result);
    }
}