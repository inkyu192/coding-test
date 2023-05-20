package programmers.level_0.basictraining;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("카운트 업")
class CountUpTest {

    CountUp test = new CountUp();

    @Test
    void case1() {
        int start = 3;
        int end = 10;

        int[] result = {3, 4, 5, 6, 7, 8, 9, 10};

        assertThat(test.solution(start, end)).isEqualTo(result);
    }
}