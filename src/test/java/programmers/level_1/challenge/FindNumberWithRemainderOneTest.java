package programmers.level_1.challenge;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("나머지가 1이 되는 수 찾기")
class FindNumberWithRemainderOneTest {

    FindNumberWithRemainderOne findNumberWithRemainderOne;

    @BeforeEach
    void beforeEach() {
        findNumberWithRemainderOne = new FindNumberWithRemainderOne();
    }

    @Test
    void case1() {
        int n = 10;
        int expected = 3;

        Assertions.assertThat(findNumberWithRemainderOne.solution(n)).isEqualTo(expected);
    }

    @Test
    void case2() {
        int n = 12;
        int expected = 11;

        Assertions.assertThat(findNumberWithRemainderOne.solution(n)).isEqualTo(expected);
    }
}