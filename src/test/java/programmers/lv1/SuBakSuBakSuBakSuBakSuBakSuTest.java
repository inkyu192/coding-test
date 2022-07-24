package programmers.lv1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("수박수박수박수박수박수?")
class SuBakSuBakSuBakSuBakSuBakSuTest {

    SuBakSuBakSuBakSuBakSuBakSu suBakSuBakSuBakSuBakSuBakSu = new SuBakSuBakSuBakSuBakSuBakSu();

    @Test
    void testCase1() {
        int n = 3;

        String expected = "수박수";

        assertThat(suBakSuBakSuBakSuBakSuBakSu.solution(n)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int n = 4;

        String expected = "수박수박";

        assertThat(suBakSuBakSuBakSuBakSuBakSu.solution(n)).isEqualTo(expected);
    }
}