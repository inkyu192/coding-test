package programmers.introduction.level0;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("합성수 찾기")
class FindCompositeNumberTest {

    FindCompositeNumber findCompositeNumber = new FindCompositeNumber();

    @Test
    void testCase1() {
        int n = 10;

        int expected = 5;

        assertThat(findCompositeNumber.solution(n)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int n = 15;

        int expected = 8;

        assertThat(findCompositeNumber.solution(n)).isEqualTo(expected);
    }
}