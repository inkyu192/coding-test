package programmers.level_0.introduction;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("중복된 문자 제거")
class RemoveDuplicateStringTest {

    RemoveDuplicateString test = new RemoveDuplicateString();

    @Test
    void case1() {
        String my_string = "people";

        String result = "peol";

        assertThat(test.solution(my_string)).isEqualTo(result);
    }

    @Test
    void case2() {
        String my_string = "We are the world";

        String result = "We arthwold";

        assertThat(test.solution(my_string)).isEqualTo(result);
    }
}