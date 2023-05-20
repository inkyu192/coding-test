package programmers.level_0.basictraining;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("공백으로 구분하기 1")
class SeparateBySpaceOneTest {

    SeparateBySpaceOne test = new SeparateBySpaceOne();

    @Test
    void case1() {
        String my_string = "i love you";

        String[] result = {"i", "love", "you"};

        assertThat(test.solution(my_string)).isEqualTo(result);
    }

    @Test
    void case2() {
        String my_string = "programmers";

        String[] result = {"programmers"};

        assertThat(test.solution(my_string)).isEqualTo(result);
    }
}