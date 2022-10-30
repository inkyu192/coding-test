package programmers.introduction.level0;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("7의 개수")
class CountOfSevenTest {

    CountOfSeven countOfSeven = new CountOfSeven();

    @Test
    void testCase1() {
        int[] array = {7, 77, 17};

        int expected = 4;

        assertThat(countOfSeven.solution(array)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int[] array = {10, 29};

        int expected = 0;

        assertThat(countOfSeven.solution(array)).isEqualTo(expected);
    }
}