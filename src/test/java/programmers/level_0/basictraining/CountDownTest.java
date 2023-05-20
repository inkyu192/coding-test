package programmers.level_0.basictraining;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("카운트 다운")
class CountDownTest {

    CountDown test = new CountDown();

    @Test
    void case1() {
        int start = 10;
        int end = 3;

        int[] result = {10, 9, 8, 7, 6, 5, 4, 3};

        assertThat(test.solution(start, end)).isEqualTo(result);
    }
}