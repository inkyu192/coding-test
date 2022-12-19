package programmers.practice.level1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("가장 가까운 같은 글자")
class NearestIdenticalLetterTest {

    NearestIdenticalLetter nearestIdenticalLetter = new NearestIdenticalLetter();

    @Test
    void testCase1() {
        String s = "banana";

        int[] expected = {-1, -1, -1, 2, 2, 2};

        assertThat(nearestIdenticalLetter.solution(s)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        String s = "foobar";

        int[] expected = {-1, -1, 1, -1, -1, -1};

        assertThat(nearestIdenticalLetter.solution(s)).isEqualTo(expected);
    }
}