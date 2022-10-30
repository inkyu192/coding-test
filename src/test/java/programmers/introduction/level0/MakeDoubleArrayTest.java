package programmers.introduction.level0;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("배열 두배 만들기")
class MakeDoubleArrayTest {

    MakeDoubleArray makeDoubleArray = new MakeDoubleArray();

    @Test
    void testCase1() {
        int[] numbers = {1, 2, 3, 4, 5};

        int[] expected = {2, 4, 6, 8, 10};

        assertThat(makeDoubleArray.solution(numbers)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int[] numbers = {1, 2, 100, -99, 1, 2, 3};

        int[] expected = {2, 4, 200, -198, 2, 4, 6};

        assertThat(makeDoubleArray.solution(numbers)).isEqualTo(expected);
    }
}