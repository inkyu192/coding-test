package programmers.level_0.introduction;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("문자열 뒤집기")
class FlipStringTest {

    FlipString test = new FlipString();

    @Test
    void case1() {
        String my_string = "jaron";

        String result = "noraj";

        assertThat(test.solution(my_string)).isEqualTo(result);
    }

    @Test
    void case2() {
        String my_string = "bread";

        String result = "daerb";

        assertThat(test.solution(my_string)).isEqualTo(result);
    }
}