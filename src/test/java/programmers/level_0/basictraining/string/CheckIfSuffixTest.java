package programmers.level_0.basictraining.string;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("접미사인지 확인하기")
class CheckIfSuffixTest {

    CheckIfSuffix test = new CheckIfSuffix();

    @Test
    void case1() {
        String my_string = "banana";
        String is_suffix = "ana";

        int result = 1;

        assertThat(test.solution(my_string, is_suffix)).isEqualTo(result);
    }

    @Test
    void case2() {
        String my_string = "banana";
        String is_suffix = "nan";

        int result = 0;

        assertThat(test.solution(my_string, is_suffix)).isEqualTo(result);
    }

    @Test
    void case3() {
        String my_string = "banana";
        String is_suffix = "wxyz";

        int result = 0;

        assertThat(test.solution(my_string, is_suffix)).isEqualTo(result);
    }

    @Test
    void case4() {
        String my_string = "banana";
        String is_suffix = "abanana";

        int result = 0;

        assertThat(test.solution(my_string, is_suffix)).isEqualTo(result);
    }
}