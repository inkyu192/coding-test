package programmers.introduction.level0;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("중복된 숫자 개수")
class CountDuplicateNumberTest {

    CountDuplicateNumber countDuplicateNumber = new CountDuplicateNumber();

    @Test
    void testCase1() {
        int[] array = {1, 1, 2, 3, 4, 5};

        int n = 1;

        int expected = 2;

        assertThat(countDuplicateNumber.solution(array, n)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int[] array = {0, 2, 3, 4};

        int n = 1;

        int expected = 0;

        assertThat(countDuplicateNumber.solution(array, n)).isEqualTo(expected);
    }
}