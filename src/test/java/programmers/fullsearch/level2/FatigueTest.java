package programmers.fullsearch.level2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("피로도")
class FatigueTest {

    Fatigue fatigue = new Fatigue();

    @Test
    void testCase1() {
        int k = 80;
        int[][] dungeons = {{80, 20}, {50, 40}, {30, 10}};

        int expected = 3;

        assertThat(fatigue.solution(k, dungeons)).isEqualTo(expected);
    }
}