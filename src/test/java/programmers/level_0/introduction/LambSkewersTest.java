package programmers.level_0.introduction;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("양꼬치")
class LambSkewersTest {

    LambSkewers test = new LambSkewers();

    @Test
    void case1() {
        int n = 10;
        int k = 3;

        int result = 124000;

        assertThat(test.solution(n, k)).isEqualTo(result);
    }

    @Test
    void case2() {
        int n = 64;
        int k = 6;

        int result = 768000;

        assertThat(test.solution(n, k)).isEqualTo(result);
    }
}