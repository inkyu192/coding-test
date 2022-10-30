package programmers.introduction.level0;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("순서쌍의 개수")
class CountOfOrderedPairTest {

    CountOfOrderedPair countOfOrderedPair = new CountOfOrderedPair();

    @Test
    void testCase1() {
        int n = 20;

        int expected = 6;

        assertThat(countOfOrderedPair.solution(n)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int n = 100;

        int expected = 9;

        assertThat(countOfOrderedPair.solution(n)).isEqualTo(expected);
    }
}