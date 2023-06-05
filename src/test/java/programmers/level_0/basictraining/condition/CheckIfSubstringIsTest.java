package programmers.level_0.basictraining.condition;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("부분 문자열인지 확인하기")
class CheckIfSubstringIsTest {

    CheckIfSubstringIs test = new CheckIfSubstringIs();

    @Test
    void case1() {
        String my_string = "banana";
        String target = "ana";

        int result = 1;

        assertThat(test.solution(my_string, target)).isEqualTo(result);
    }

    @Test
    void case2() {
        String my_string = "banana";
        String target = "wxyz";

        int result = 0;

        assertThat(test.solution(my_string, target)).isEqualTo(result);
    }
}