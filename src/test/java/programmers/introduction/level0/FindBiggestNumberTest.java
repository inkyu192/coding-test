package programmers.introduction.level0;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("가장 큰 수 찾기")
class FindBiggestNumberTest {

    FindBiggestNumber findBiggestNumber = new FindBiggestNumber();

    @Test
    void testCase1() {
        int[] array = {1, 8, 3};

        int[] expected = {8, 1};

        assertThat(findBiggestNumber.solution(array)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int[] array = {9, 10, 11, 8};

        int[] expected = {11, 2};

        assertThat(findBiggestNumber.solution(array)).isEqualTo(expected);
    }
}