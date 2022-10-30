package programmers.introduction.level0;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("문자열 밀기")
class StringPushTest {

    StringPush stringPush = new StringPush();

    @Test
    void testCase1() {
        String A = "hello";
        String B = "ohell";

        int expected = 1;

        assertThat(stringPush.solution(A, B)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        String A = "apple";
        String B = "elppa";

        int expected = -1;

        assertThat(stringPush.solution(A, B)).isEqualTo(expected);
    }
}