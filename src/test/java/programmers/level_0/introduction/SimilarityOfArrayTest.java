package programmers.level_0.introduction;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("배열의 유사도")
class SimilarityOfArrayTest {

    SimilarityOfArray test = new SimilarityOfArray();

    @Test
    void case1() {
        String[] s1 = {"a", "b", "c"};
        String[] s2 = {"com", "b", "d", "p", "c"};

        int result = 2;

        assertThat(test.solution(s1, s2)).isEqualTo(result);
    }

    @Test
    void case2() {
        String[] s1 = {"n", "omg"};
        String[] s2 = {"m", "dot"};

        int result = 0;

        assertThat(test.solution(s1, s2)).isEqualTo(result);
    }
}