package programmers.introduction.level0;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("배열의 유사도")
class SimilarityOfArrayTest {

    SimilarityOfArray similarityOfArray = new SimilarityOfArray();

    @Test
    void testCase1() {
        String[] s1 = {"a", "b", "c"};
        String[] s2 = {"com", "b", "d", "p", "c"};

        int expected = 2;

        assertThat(similarityOfArray.solution(s1, s2)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        String[] s1 = {"n", "omg"};
        String[] s2 = {"m", "dot"};

        int expected = 0;

        assertThat(similarityOfArray.solution(s1, s2)).isEqualTo(expected);
    }
}