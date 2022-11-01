package programmers.introduction.level0;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("최빈값 구하기")
class GetModeTest {

    GetMode getMode = new GetMode();

    @Test
    void testCase1() {
        int[] array = {1, 2, 3, 3, 3, 4};

        int expected = 3;

        assertThat(getMode.solution(array)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int[] array = {1, 1, 2, 2};

        int expected = -1;

        assertThat(getMode.solution(array)).isEqualTo(expected);
    }

    @Test
    void testCase3() {
        int[] array = {1};

        int expected = 1;

        assertThat(getMode.solution(array)).isEqualTo(expected);
    }
}