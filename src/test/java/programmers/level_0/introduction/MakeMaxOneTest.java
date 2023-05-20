package programmers.level_0.introduction;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("최댓값 만들기 (1)")
class MakeMaxOneTest {

    MakeMaxOne test = new MakeMaxOne();

    @Test
    void case1() {
        int[] numbers = {1, 2, 3, 4, 5};

        int result = 20;

        assertThat(test.solution(numbers)).isEqualTo(result);
    }


    @Test
    void case2() {
        int[] numbers = {0, 31, 24, 10, 1, 9};

        int result = 744;

        assertThat(test.solution(numbers)).isEqualTo(result);
    }
}