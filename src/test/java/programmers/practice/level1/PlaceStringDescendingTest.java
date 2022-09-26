package programmers.practice.level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("문자열 내림차순으로 배치하기")
class PlaceStringDescendingTest {

    PlaceStringDescending placeStringDescending = new PlaceStringDescending();

    @Test
    void testCase1() {
        String s = "Zbcdefg";

        String excepted = "gfedcbZ";

        assertThat(placeStringDescending.solution(s)).isEqualTo(excepted);
    }

    @Test
    void testCase2() {
        String s = "acegfdb";

        String excepted = "gfedcba";

        assertThat(placeStringDescending.solution(s)).isEqualTo(excepted);
    }
}