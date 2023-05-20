package programmers.level_0.introduction;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("k의 개수")
class CountOfKTest {

    CountOfK test = new CountOfK();

    @Test
    void case1() {
        int i = 1;
        int j = 13;
        int k = 1;

        int result = 6;

        assertThat(test.solution(i, j, k)).isEqualTo(result);
    }

    @Test
    void case2() {
        int i = 10;
        int j = 50;
        int k = 5;

        int result = 5;

        assertThat(test.solution(i, j, k)).isEqualTo(result);
    }

    @Test
    void case3() {
        int i = 3;
        int j = 10;
        int k = 2;

        int result = 0;

        assertThat(test.solution(i, j, k)).isEqualTo(result);
    }
}