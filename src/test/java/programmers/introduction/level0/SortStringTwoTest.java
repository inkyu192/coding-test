package programmers.introduction.level0;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("문자열 정렬하기 (2)")
class SortStringTwoTest {

    SortStringTwo sortStringTwo = new SortStringTwo();

    @Test
    void testCase1() {
        String my_string = "Bcad";

        String expected = "abcd";

        assertThat(sortStringTwo.solution(my_string)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        String my_string = "heLLo";

        String expected = "ehllo";

        assertThat(sortStringTwo.solution(my_string)).isEqualTo(expected);
    }

    @Test
    void testCase3() {
        String my_string = "Python";

        String expected = "hnopty";

        assertThat(sortStringTwo.solution(my_string)).isEqualTo(expected);
    }
}