package programmers.level_0.introduction;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("진료 순서 정하기")
class SetTreatmentOrderTest {

    SetTreatmentOrder test = new SetTreatmentOrder();

    @Test
    void case1() {
        int[] emergency = {3, 76, 24};

        int[] result = {3, 1, 2};

        assertThat(test.solution(emergency)).isEqualTo(result);
    }

    @Test
    void case2() {
        int[] emergency = {1, 2, 3, 4, 5, 6, 7};

        int[] result = {7, 6, 5, 4, 3, 2, 1};

        assertThat(test.solution(emergency)).isEqualTo(result);
    }

    @Test
    void case3() {
        int[] emergency = {30, 10, 23, 6, 100};

        int[] result = {2, 4, 3, 5, 1};

        assertThat(test.solution(emergency)).isEqualTo(result);
    }
}