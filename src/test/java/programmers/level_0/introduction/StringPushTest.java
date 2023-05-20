package programmers.level_0.introduction;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("문자열 밀기")
class StringPushTest {

    StringPush test = new StringPush();

    @Test
    void case1() {
        String A = "hello";
        String B = "ohell";

        int result = 1;

        assertThat(test.solution(A, B)).isEqualTo(result);
    }

    @Test
    void case2() {
        String A = "apple";
        String B = "elppa";

        int result = -1;

        assertThat(test.solution(A, B)).isEqualTo(result);
    }
}