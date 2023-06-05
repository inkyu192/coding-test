package programmers.level_0.basictraining.list;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("배열 만들기 1")
class CreateArray1Test {

    CreateArray1 test = new CreateArray1();

    @Test
    void case1() {
        int n = 10;
        int k = 3;

        int[] result = {3, 6, 9};

        assertThat(test.solution(n, k)).isEqualTo(result);
    }

    @Test
    void case2() {
        int n = 15;
        int k = 5;

        int[] result = {5, 10, 15};

        assertThat(test.solution(n, k)).isEqualTo(result);
    }
}