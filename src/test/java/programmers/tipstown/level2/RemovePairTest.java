package programmers.tipstown.level2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("짝지어 제거하기")
class RemovePairTest {

    RemovePair removePair = new RemovePair();

    @Test
    void testCase1() {
        String s = "baabaa";

        int expected = 1;

        assertThat(removePair.solution(s)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        String s = "cdcd";

        int expected = 0;

        assertThat(removePair.solution(s)).isEqualTo(expected);
    }
}