package programmers.lv2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("더 맵게")
class MoreSpicyTest {

    MoreSpicy moreSpicy = new MoreSpicy();

    @Test
    void testCase1() {
        int[] scoville = {1, 2, 3, 9, 10, 12};
        int K = 7;

        int expected = 2;

        assertThat(moreSpicy.solution(scoville, K)).isEqualTo(expected);
    }
}