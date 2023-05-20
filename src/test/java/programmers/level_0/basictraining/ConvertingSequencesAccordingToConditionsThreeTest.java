package programmers.level_0.basictraining;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("조건에 맞게 수열 변환하기 3")
class ConvertingSequencesAccordingToConditionsThreeTest {

    ConvertingSequencesAccordingToConditionsThree test = new ConvertingSequencesAccordingToConditionsThree();

    @Test
    void case1() {
        int[] arr = {1, 2, 3, 100, 99, 98};
        int k = 3;

        int[] result = {3, 6, 9, 300, 297, 294};

        assertThat(test.solution(arr, k)).isEqualTo(result);
    }


    @Test
    void case2() {
        int[] arr = {1, 2, 3, 100, 99, 98};
        int k = 2;

        int[] result = {3, 4, 5, 102, 101, 100};

        assertThat(test.solution(arr, k)).isEqualTo(result);
    }
}