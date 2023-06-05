package programmers.level_0.basictraining.string;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("원하는 문자열 찾기")
class FindTheStringYouWantTest {

    FindTheStringYouWant test = new FindTheStringYouWant();

    @Test
    void case1() {
        String myString = "AbCdEfG";
        String pat = "aBc";

        int result = 1;

        assertThat(test.solution(myString, pat)).isEqualTo(result);
    }

    @Test
    void case2() {
        String myString = "aaAA";
        String pat = "aaaaa";

        int result = 0;

        assertThat(test.solution(myString, pat)).isEqualTo(result);
    }
}