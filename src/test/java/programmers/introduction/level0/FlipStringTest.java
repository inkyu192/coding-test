package programmers.introduction.level0;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("문자열 뒤집기")
class FlipStringTest {

    FlipString flipString = new FlipString();

    @Test
    void testCase1() {
        String my_string = "jaron";

        String expected = "noraj";

        assertThat(flipString.solution(my_string)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        String my_string = "bread";

        String expected = "daerb";

        assertThat(flipString.solution(my_string)).isEqualTo(expected);
    }
}