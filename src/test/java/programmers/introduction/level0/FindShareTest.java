package programmers.introduction.level0;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("몫 구하기")
class FindShareTest {

    FindShare findShare = new FindShare();

    @Test
    void testCase1() {
        int num1 = 10;
        int num2 = 5;

        int expected = 2;

        assertThat(findShare.solution(num1, num2)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int num1 = 7;
        int num2 = 2;

        int expected = 3;

        assertThat(findShare.solution(num1, num2)).isEqualTo(expected);
    }
}