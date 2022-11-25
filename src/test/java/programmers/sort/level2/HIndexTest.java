package programmers.sort.level2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("H-Index")
class HIndexTest {

    HIndex hIndex = new HIndex();

    @Test
    void testCase1() {
        int[] citations = {3, 0, 6, 1, 5};

        int expected = 3;

        assertThat(hIndex.solution(citations)).isEqualTo(expected);
    }
}