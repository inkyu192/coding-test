package programmers.level_0.basictraining;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("문자열 곱하기")
class MultiplyAStringTest {

    MultiplyAString test = new MultiplyAString();

    @Test
    void case1() {
        String my_string = "string";
        int k = 3;

        String result = "stringstringstring";

        assertThat(test.solution(my_string, k)).isEqualTo(result);
    }

    @Test
    void case2() {
        String my_string = "love";
        int k = 10;

        String result = "lovelovelovelovelovelovelovelovelovelove";

        assertThat(test.solution(my_string, k)).isEqualTo(result);
    }
}