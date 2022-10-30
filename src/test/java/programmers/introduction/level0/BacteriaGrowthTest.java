package programmers.introduction.level0;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("세균 증식")
class BacteriaGrowthTest {

    BacteriaGrowth bacteriaGrowth = new BacteriaGrowth();

    @Test
    void testCase1() {
        int n = 2;
        int t = 10;

        int expected = 2048;

        assertThat(bacteriaGrowth.solution(n, t)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int n = 7;
        int t = 15;

        int expected = 229376;

        assertThat(bacteriaGrowth.solution(n, t)).isEqualTo(expected);
    }
}