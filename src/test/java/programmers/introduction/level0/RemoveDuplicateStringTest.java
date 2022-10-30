package programmers.introduction.level0;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("중복된 문자 제거")
class RemoveDuplicateStringTest {

    RemoveDuplicateString removeDuplicateString = new RemoveDuplicateString();

    @Test
    void testCase1() {
        String my_string = "people";

        String expected = "peol";

        assertThat(removeDuplicateString.solution(my_string)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        String my_string = "We are the world";

        String expected = "We arthwold";

        assertThat(removeDuplicateString.solution(my_string)).isEqualTo(expected);
    }
}