package programmers.level_0.introduction;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("가장 큰 수 찾기")
class FindBiggestNumberTest {

    FindBiggestNumber test = new FindBiggestNumber();

    @Test
    void case1() {
        int[] array = {1, 8, 3};

        int[] result = {8, 1};

        assertThat(test.solution(array)).isEqualTo(result);
    }

    @Test
    void case2() {
        int[] array = {9, 10, 11, 8};

        int[] result = {11, 2};

        assertThat(test.solution(array)).isEqualTo(result);
    }
}