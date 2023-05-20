package programmers.level_0.introduction;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("모음 제거")
class RemoveVowelTest {

    RemoveVowel test = new RemoveVowel();

    @Test
    void case1() {
        String my_string = "bus";

        String result = "bs";

        assertThat(test.solution(my_string)).isEqualTo(result);
    }

    @Test
    void case2() {
        String my_string = "nice to meet you";

        String result = "nc t mt y";

        assertThat(test.solution(my_string)).isEqualTo(result);
    }
}