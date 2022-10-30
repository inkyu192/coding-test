package programmers.introduction.level0;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("제곱수 판별하기")
class DetermineSquareNumberTest {

    DetermineSquareNumber determineSquareNumber = new DetermineSquareNumber();

    @Test
    void testCase1() {
        int n = 144;

        int expected = 1;

        assertThat(determineSquareNumber.solution(n)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int n = 976;

        int expected = 2;

        assertThat(determineSquareNumber.solution(n)).isEqualTo(expected);
    }
}