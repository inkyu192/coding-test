package programmers.level_0.introduction;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("인덱스 바꾸기")
class ChangeIndexTest {

    ChangeIndex test = new ChangeIndex();

    @Test
    void case1() {
        String my_string = "hello";
        int num1 = 1;
        int num2 = 2;

        String result = "hlelo";

        assertThat(test.solution(my_string, num1, num2)).isEqualTo(result);
    }

    @Test
    void case2() {
        String my_string = "I love you";
        int num1 = 3;
        int num2 = 6;

        String result = "I l veoyou";

        assertThat(test.solution(my_string, num1, num2)).isEqualTo(result);
    }
}