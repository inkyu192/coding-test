package programmers.level_0.introduction;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("세균 증식")
class BacteriaGrowthTest {

    BacteriaGrowth test = new BacteriaGrowth();

    @Test
    void case1() {
        int n = 2;
        int t = 10;

        int result = 2048;

        assertThat(test.solution(n, t)).isEqualTo(result);
    }

    @Test
    void case2() {
        int n = 7;
        int t = 15;

        int result = 229376;

        assertThat(test.solution(n, t)).isEqualTo(result);
    }
}