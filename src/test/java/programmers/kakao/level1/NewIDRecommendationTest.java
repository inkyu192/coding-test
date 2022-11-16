package programmers.kakao.level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("신규 아이디 추천")
class NewIDRecommendationTest {

    NewIDRecommendation newIDRecommendation = new NewIDRecommendation();

    @Test
    void testCase1() {
        String new_id = "...!@BaT#*..y.abcdefghijklm";

        String expected = "bat.y.abcdefghi";

        assertThat(newIDRecommendation.solution(new_id)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        String new_id = "z-+.^.";

        String expected = "z--";

        assertThat(newIDRecommendation.solution(new_id)).isEqualTo(expected);
    }

    @Test
    void testCase3() {
        String new_id = "=.=";

        String expected = "aaa";

        assertThat(newIDRecommendation.solution(new_id)).isEqualTo(expected);
    }

    @Test
    void testCase4() {
        String new_id = "123_.def";

        String expected = "123_.def";

        assertThat(newIDRecommendation.solution(new_id)).isEqualTo(expected);
    }

    @Test
    void testCase5() {
        String new_id = "abcdefghijklmn.p";

        String expected = "abcdefghijklmn";

        assertThat(newIDRecommendation.solution(new_id)).isEqualTo(expected);
    }

    @Test
    void testCase6() {
        String new_id = "..__.abc..........._.";

        String expected = "__.abc._";

        assertThat(newIDRecommendation.solution(new_id)).isEqualTo(expected);
    }
}