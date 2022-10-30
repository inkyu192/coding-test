package programmers.introduction.level0;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("가까운 수")
class NearNumberTest {

    NearNumber nearNumber = new NearNumber();

    @Test
    void testCase1() {
        int[] array = {3, 10, 28};
        int n = 20;

        int expected = 28;

        assertThat(nearNumber.solution(array, n)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int[] array = {10, 11, 12};
        int n = 13;

        int expected = 12;

        assertThat(nearNumber.solution(array, n)).isEqualTo(expected);
    }
}