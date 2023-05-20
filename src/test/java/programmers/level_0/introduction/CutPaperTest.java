package programmers.level_0.introduction;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("종이 자르기")
class CutPaperTest {

    CutPaper test = new CutPaper();

    @Test
    void case1() {
        int M = 2;
        int N = 2;

        int result = 3;

        assertThat(test.solution(M, N)).isEqualTo(result);
    }

    @Test
    void case2() {
        int M = 2;
        int N = 5;

        int result = 9;

        assertThat(test.solution(M, N)).isEqualTo(result);
    }

    @Test
    void case3() {
        int M = 1;
        int N = 1;

        int result = 0;

        assertThat(test.solution(M, N)).isEqualTo(result);
    }
}