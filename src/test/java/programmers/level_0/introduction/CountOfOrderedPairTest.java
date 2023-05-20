package programmers.level_0.introduction;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("순서쌍의 개수")
class CountOfOrderedPairTest {

    CountOfOrderedPair test = new CountOfOrderedPair();

    @Test
    void case1() {
        int n = 20;

        int result = 6;

        assertThat(test.solution(n)).isEqualTo(result);
    }

    @Test
    void case2() {
        int n = 100;

        int result = 9;

        assertThat(test.solution(n)).isEqualTo(result);
    }
}