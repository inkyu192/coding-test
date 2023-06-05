package programmers.level_0.basictraining.string;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import programmers.level_0.basictraining.string.ConcatenateSubstringsToCreateString;

import static org.assertj.core.api.Assertions.*;

@DisplayName("부분 문자열 이어 붙여 문자열 만들기")
class ConcatenateSubstringsToCreateStringTest {

    ConcatenateSubstringsToCreateString test = new ConcatenateSubstringsToCreateString();

    @Test
    void case1() {
        String[] my_strings = {"progressive", "hamburger", "hammer", "ahocorasick"};
        int[][] parts = {{0, 4}, {1, 2}, {3, 5}, {7, 7}};

        String result = "programmers";

        assertThat(test.solution(my_strings, parts)).isEqualTo(result);
    }
}