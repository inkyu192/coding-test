package programmers.introduction.level0;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("인덱스 바꾸기")
class ChangeIndexTest {

    ChangeIndex changeIndex = new ChangeIndex();

    @Test
    void testCase1() {
        String my_string = "hello";
        int num1 = 1;
        int num2 = 2;

        String expected = "hlelo";

        assertThat(changeIndex.solution(my_string, num1, num2)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        String my_string = "I love you";
        int num1 = 3;
        int num2 = 6;

        String expected = "I l veoyou";

        assertThat(changeIndex.solution(my_string, num1, num2)).isEqualTo(expected);
    }
}