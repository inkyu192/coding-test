package programmers.introduction.level0;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("짝수는 싫어요")
class HateEvenTest {

    HateEven hateEven = new HateEven();

    @Test
    void testCase1() {
        int n = 10;

        int[] expected = {1, 3, 5, 7, 9};

        Assertions.assertThat(hateEven.solution(n)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int n = 15;

        int[] expected = {1, 3, 5, 7, 9, 11, 13, 15};

        Assertions.assertThat(hateEven.solution(n)).isEqualTo(expected);
    }
}