package programmers.level_0.introduction;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("짝수는 싫어요")
class HateEvenTest {

    HateEven test = new HateEven();

    @Test
    void case1() {
        int n = 10;

        int[] result = {1, 3, 5, 7, 9};

        Assertions.assertThat(test.solution(n)).isEqualTo(result);
    }

    @Test
    void case2() {
        int n = 15;

        int[] result = {1, 3, 5, 7, 9, 11, 13, 15};

        Assertions.assertThat(test.solution(n)).isEqualTo(result);
    }
}