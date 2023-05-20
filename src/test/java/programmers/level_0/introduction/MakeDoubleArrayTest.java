package programmers.level_0.introduction;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("배열 두배 만들기")
class MakeDoubleArrayTest {

    MakeDoubleArray test = new MakeDoubleArray();

    @Test
    void case1() {
        int[] numbers = {1, 2, 3, 4, 5};

        int[] result = {2, 4, 6, 8, 10};

        assertThat(test.solution(numbers)).isEqualTo(result);
    }

    @Test
    void case2() {
        int[] numbers = {1, 2, 100, -99, 1, 2, 3};

        int[] result = {2, 4, 200, -198, 2, 4, 6};

        assertThat(test.solution(numbers)).isEqualTo(result);
    }
}