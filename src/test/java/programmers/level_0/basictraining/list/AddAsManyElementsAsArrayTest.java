package programmers.level_0.basictraining.list;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("배열의 원소만큼 추가하기")
class AddAsManyElementsAsArrayTest {

    AddAsManyElementsAsArray test = new AddAsManyElementsAsArray();

    @Test
    void case1() {
        int[] arr = {5, 1, 4};

        int[] result = {5, 5, 5, 5, 5, 1, 4, 4, 4, 4};

        assertThat(test.solution(arr)).isEqualTo(result);
    }

    @Test
    void case2() {
        int[] arr = {6, 6};

        int[] result = {6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6};

        assertThat(test.solution(arr)).isEqualTo(result);
    }

    @Test
    void case3() {
        int[] arr = {1};

        int[] result = {1};

        assertThat(test.solution(arr)).isEqualTo(result);
    }
}