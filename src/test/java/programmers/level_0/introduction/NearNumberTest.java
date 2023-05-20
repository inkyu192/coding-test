package programmers.level_0.introduction;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("가까운 수")
class NearNumberTest {

    NearNumber test = new NearNumber();

    @Test
    void case1() {
        int[] array = {3, 10, 28};
        int n = 20;

        int result = 28;

        assertThat(test.solution(array, n)).isEqualTo(result);
    }

    @Test
    void case2() {
        int[] array = {10, 11, 12};
        int n = 13;

        int result = 12;

        assertThat(test.solution(array, n)).isEqualTo(result);
    }
}