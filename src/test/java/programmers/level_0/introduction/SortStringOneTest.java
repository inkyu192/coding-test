package programmers.level_0.introduction;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("문자열 정렬하기 (1)")
class SortStringOneTest {

    SortStringOne test = new SortStringOne();

    @Test
    void case1() {
        String my_string = "hi12392";

        int[] result = {1, 2, 2, 3, 9};

        assertThat(test.solution(my_string)).isEqualTo(result);
    }

    @Test
    void case2() {
        String my_string = "p2o4i8gj2";

        int[] result = {2, 2, 4, 8};

        assertThat(test.solution(my_string)).isEqualTo(result);
    }

    @Test
    void case3() {
        String my_string = "abcde0";

        int[] result = {0};

        assertThat(test.solution(my_string)).isEqualTo(result);
    }
}