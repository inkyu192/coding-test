package programmers.level_0.introduction;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("중앙값 구하기")
class FindMedianTest {

    FindMedian test = new FindMedian();

    @Test
    void case1() {
        int[] array = {1, 2, 7, 10, 11};

        int result = 7;

        assertThat(test.solution(array)).isEqualTo(result);
    }

    @Test
    void case2() {
        int[] array = {9, -1, 0};

        int result = 0;

        assertThat(test.solution(array)).isEqualTo(result);
    }
}