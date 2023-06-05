package programmers.level_0.basictraining.string;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import programmers.level_0.basictraining.string.ConcatenateLettersToCreateAString;

import static org.assertj.core.api.Assertions.*;

@DisplayName("글자 이어 붙여 문자열 만들기")
class ConcatenateLettersToCreateAStringTest {

    ConcatenateLettersToCreateAString test = new ConcatenateLettersToCreateAString();

    @Test
    void case1() {
        String my_string = "cvsgiorszzzmrpaqpe";
        int[] index_list = {16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7};

        String result = "programmers";

        assertThat(test.solution(my_string, index_list)).isEqualTo(result);
    }

    @Test
    void case2() {
        String my_string = "zpiaz";
        int[] index_list = {1, 2, 0, 0, 3};

        String result = "pizza";

        assertThat(test.solution(my_string, index_list)).isEqualTo(result);
    }
}