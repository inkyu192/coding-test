package programmers.introduction.level0;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("종이 자르기")
class CutPaperTest {

    CutPaper cutPaper = new CutPaper();

    @Test
    void testCase1() {
        int M = 2;
        int N = 2;

        int expected = 3;

        assertThat(cutPaper.solution(M, N)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int M = 2;
        int N = 5;

        int expected = 9;

        assertThat(cutPaper.solution(M, N)).isEqualTo(expected);
    }

    @Test
    void testCase3() {
        int M = 1;
        int N = 1;

        int expected = 0;

        assertThat(cutPaper.solution(M, N)).isEqualTo(expected);
    }
}