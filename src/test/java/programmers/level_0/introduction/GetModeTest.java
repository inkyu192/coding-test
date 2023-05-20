package programmers.level_0.introduction;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("최빈값 구하기")
class GetModeTest {

    GetMode test = new GetMode();

    @Test
    void case1() {
        int[] array = {1, 2, 3, 3, 3, 4};

        int result = 3;

        assertThat(test.solution(array)).isEqualTo(result);
    }

    @Test
    void case2() {
        int[] array = {1, 1, 2, 2};

        int result = -1;

        assertThat(test.solution(array)).isEqualTo(result);
    }

    @Test
    void case3() {
        int[] array = {1};

        int result = 1;

        assertThat(test.solution(array)).isEqualTo(result);
    }
}