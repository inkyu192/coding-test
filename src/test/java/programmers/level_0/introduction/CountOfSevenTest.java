package programmers.level_0.introduction;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("7의 개수")
class CountOfSevenTest {

    CountOfSeven test = new CountOfSeven();

    @Test
    void case1() {
        int[] array = {7, 77, 17};

        int result = 4;

        assertThat(test.solution(array)).isEqualTo(result);
    }

    @Test
    void case2() {
        int[] array = {10, 29};

        int result = 0;

        assertThat(test.solution(array)).isEqualTo(result);
    }
}