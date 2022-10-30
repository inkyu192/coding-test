package programmers.introduction.level0;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("약수 구하기")
class GetDivisorTest {

    GetDivisor getDivisor = new GetDivisor();

    @Test
    void testCase1() {
        int n = 24;

        int[] expected = {1, 2, 3, 4, 6, 8, 12, 24};

        assertThat(getDivisor.solution(n)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int n = 29;

        int[] expected = {1, 29};

        assertThat(getDivisor.solution(n)).isEqualTo(expected);
    }
}