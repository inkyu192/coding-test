package programmers.level_0.basictraining;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("부분 문자열")
class SubstringTest {

    Substring test = new Substring();

    @Test
    void case1() {
        String str1 = "abc";
        String str2 = "aabcc";

        int result = 1;

        assertThat(test.solution(str1, str2)).isEqualTo(result);
    }

    @Test
    void case2() {
        String str1 = "tbt";
        String str2 = "tbbttb";

        int result = 0;

        assertThat(test.solution(str1, str2)).isEqualTo(result);
    }
}