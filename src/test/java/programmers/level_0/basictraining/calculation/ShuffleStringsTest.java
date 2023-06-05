package programmers.level_0.basictraining.calculation;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("문자열 섞기")
class ShuffleStringsTest {

    ShuffleStrings test = new ShuffleStrings();

    @Test
    void case1() {
        String str1 = "aaaaa";
        String str2 = "bbbbb";

        String result = "ababababab";

        assertThat(test.solution(str1, str2)).isEqualTo(result);
    }
}