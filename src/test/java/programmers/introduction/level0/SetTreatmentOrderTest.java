package programmers.introduction.level0;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("진료 순서 정하기")
class SetTreatmentOrderTest {

    SetTreatmentOrder setTreatmentOrder = new SetTreatmentOrder();

    @Test
    void testCase1() {
        int[] emergency = {3, 76, 24};

        int[] expected = {3, 1, 2};

        assertThat(setTreatmentOrder.solution(emergency)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int[] emergency = {1, 2, 3, 4, 5, 6, 7};

        int[] expected = {7, 6, 5, 4, 3, 2, 1};

        assertThat(setTreatmentOrder.solution(emergency)).isEqualTo(expected);
    }

    @Test
    void testCase3() {
        int[] emergency = {30, 10, 23, 6, 100};

        int[] expected = {2, 4, 3, 5, 1};

        assertThat(setTreatmentOrder.solution(emergency)).isEqualTo(expected);
    }
}