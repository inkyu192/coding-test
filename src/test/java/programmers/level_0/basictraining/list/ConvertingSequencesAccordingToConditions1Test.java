package programmers.level_0.basictraining.list;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("조건에 맞게 수열 변환하기 1")
class ConvertingSequencesAccordingToConditions1Test {

    ConvertingSequencesAccordingToConditions1 test = new ConvertingSequencesAccordingToConditions1();

    @Test
    void case1() {
        int[] arr = {1, 2, 3, 100, 99, 98};

        int[] result = {2, 2, 6, 50, 99, 49};

        assertThat(test.solution(arr)).isEqualTo(result);
    }
}