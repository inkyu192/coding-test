package programmers.level_0.introduction;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("문자열 정렬하기 (2)")
class SortStringTwoTest {

    SortStringTwo test = new SortStringTwo();

    @Test
    void case1() {
        String my_string = "Bcad";

        String result = "abcd";

        assertThat(test.solution(my_string)).isEqualTo(result);
    }

    @Test
    void case2() {
        String my_string = "heLLo";

        String result = "ehllo";

        assertThat(test.solution(my_string)).isEqualTo(result);
    }

    @Test
    void case3() {
        String my_string = "Python";

        String result = "hnopty";

        assertThat(test.solution(my_string)).isEqualTo(result);
    }
}