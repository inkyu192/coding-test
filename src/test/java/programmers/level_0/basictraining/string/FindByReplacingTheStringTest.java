package programmers.level_0.basictraining.string;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("문자열 바꿔서 찾기")
class FindByReplacingTheStringTest {

    FindByReplacingTheString test = new FindByReplacingTheString();

    @Test
    void case1() {
        String myString = "ABBAA";
        String pat = "AABB";

        int result = 1;

        assertThat(test.solution(myString, pat)).isEqualTo(result);
    }

    @Test
    void case2() {
        String myString = "ABAB";
        String pat = "ABAB";

        int result = 0;

        assertThat(test.solution(myString, pat)).isEqualTo(result);
    }
}