package programmers.introduction.level0;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("문자열 정렬하기 (1)")
class SortStringOneTest {

    SortStringOne sortStringOne = new SortStringOne();

    @Test
    void testCase1() {
        String my_string = "hi12392";

        int[] expected = {1, 2, 2, 3, 9};

        assertThat(sortStringOne.solution(my_string)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        String my_string = "p2o4i8gj2";

        int[] expected = {2, 2, 4, 8};

        assertThat(sortStringOne.solution(my_string)).isEqualTo(expected);
    }

    @Test
    void testCase3() {
        String my_string = "abcde0";

        int[] expected = {0};

        assertThat(sortStringOne.solution(my_string)).isEqualTo(expected);
    }
}