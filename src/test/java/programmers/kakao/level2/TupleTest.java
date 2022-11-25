package programmers.kakao.level2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("튜플")
class TupleTest {

    Tuple tuple = new Tuple();

    @Test
    void testCase1() {
        String s = "{{2},{2,1},{2,1,3},{2,1,3,4}}";

        int[] expected = {2, 1, 3, 4};

        assertThat(tuple.solution(s)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        String s = "{{1,2,3},{2,1},{1,2,4,3},{2}}";

        int[] expected = {2, 1, 3, 4};

        assertThat(tuple.solution(s)).isEqualTo(expected);
    }

    @Test
    void testCase3() {
        String s = "{{20,111},{111}}";

        int[] expected = {111, 20};

        assertThat(tuple.solution(s)).isEqualTo(expected);
    }

    @Test
    void testCase4() {
        String s = "{{123}}";

        int[] expected = {123};

        assertThat(tuple.solution(s)).isEqualTo(expected);
    }

    @Test
    void testCase5() {
        String s = "{{4,2,3},{3},{2,3,4,1},{2,3}}";

        int[] expected = {3, 2, 4, 1};

        assertThat(tuple.solution(s)).isEqualTo(expected);
    }
}