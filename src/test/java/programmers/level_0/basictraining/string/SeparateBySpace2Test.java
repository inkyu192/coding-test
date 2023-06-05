package programmers.level_0.basictraining.string;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("공백으로 구분하기 2")
class SeparateBySpace2Test {

    SeparateBySpace2 test = new SeparateBySpace2();

    @Test
    void case1() {
        String my_string = " i    love  you";

        String[] result = {"i", "love", "you"};

        assertThat(test.solution(my_string)).isEqualTo(result);
    }

    @Test
    void case2() {
        String my_string = "    programmers  ";

        String[] result = {"programmers"};

        assertThat(test.solution(my_string)).isEqualTo(result);
    }
}