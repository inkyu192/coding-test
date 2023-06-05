package programmers.level_0.basictraining.condition;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("꼬리 문자열")
class TailStringTest {

    TailString test = new TailString();

    @Test
    void case1() {
        String[] str_list = {"abc", "def", "ghi"};
        String ex = "ef";

        String result = "abcghi";

        assertThat(test.solution(str_list, ex)).isEqualTo(result);
    }

    @Test
    void case2() {
        String[] str_list = {"abc", "bbc", "cbc"};
        String ex = "c";

        String result = "";

        assertThat(test.solution(str_list, ex)).isEqualTo(result);
    }
}