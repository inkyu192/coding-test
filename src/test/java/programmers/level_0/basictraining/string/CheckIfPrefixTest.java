package programmers.level_0.basictraining.string;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("접두사인지 확인하기")
class CheckIfPrefixTest {

    CheckIfPrefix test = new CheckIfPrefix();

    @Test
    void case1() {
        String my_string = "banana";
        String is_prefix = "ban";

        int result = 1;

        assertThat(test.solution(my_string, is_prefix)).isEqualTo(result);
    }

    @Test
    void case2() {
        String my_string = "banana";
        String is_prefix = "nan";

        int result = 0;

        assertThat(test.solution(my_string, is_prefix)).isEqualTo(result);
    }

    @Test
    void case3() {
        String my_string = "banana";
        String is_prefix = "abcd";

        int result = 0;

        assertThat(test.solution(my_string, is_prefix)).isEqualTo(result);
    }

    @Test
    void case4() {
        String my_string = "banana";
        String is_prefix = "bananan";

        int result = 0;

        assertThat(test.solution(my_string, is_prefix)).isEqualTo(result);
    }
}