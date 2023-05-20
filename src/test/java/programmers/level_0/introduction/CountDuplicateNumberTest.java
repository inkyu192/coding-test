package programmers.level_0.introduction;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("중복된 숫자 개수")
class CountDuplicateNumberTest {

    CountDuplicateNumber test = new CountDuplicateNumber();

    @Test
    void case1() {
        int[] array = {1, 1, 2, 3, 4, 5};

        int n = 1;

        int result = 2;

        assertThat(test.solution(array, n)).isEqualTo(result);
    }

    @Test
    void case2() {
        int[] array = {0, 2, 3, 4};

        int n = 1;

        int result = 0;

        assertThat(test.solution(array, n)).isEqualTo(result);
    }
}