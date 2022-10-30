package programmers.introduction.level0;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("숫자 찾기")
class FindNumberTest {

    FindNumber findNumber = new FindNumber();

    @Test
    void testCase1() {
        int num = 29183;
        int k = 1;

        int expected = 3;

        assertThat(findNumber.solution(num, k)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int num = 232443;
        int k = 4;

        int expected = 4;

        assertThat(findNumber.solution(num, k)).isEqualTo(expected);
    }

    @Test
    void testCase3() {
        int num = 123456;
        int k = 7;

        int expected = -1;

        assertThat(findNumber.solution(num, k)).isEqualTo(expected);
    }
}