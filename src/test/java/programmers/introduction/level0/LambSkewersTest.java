package programmers.introduction.level0;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("양꼬치")
class LambSkewersTest {

    LambSkewers lambSkewers = new LambSkewers();

    @Test
    void testCase1() {
        int n = 10;
        int k = 3;

        int expected = 124000;

        assertThat(lambSkewers.solution(n, k)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int n = 64;
        int k = 6;

        int expected = 768000;

        assertThat(lambSkewers.solution(n, k)).isEqualTo(expected);
    }
}