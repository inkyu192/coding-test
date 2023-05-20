package programmers.level_0.introduction;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("특정 문자 제거하기")
class RemoveSpecificStringTest {

    RemoveSpecificString test = new RemoveSpecificString();

    @Test
    void case1() {
        String my_string = "abcdef";
        String letter = "f";

        String result = "abcde";

        assertThat(test.solution(my_string, letter)).isEqualTo(result);
    }

    @Test
    void case2() {
        String my_string = "BCBdbe";
        String letter = "B";

        String result = "Cdbe";

        assertThat(test.solution(my_string, letter)).isEqualTo(result);
    }
}