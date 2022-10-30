package programmers.introduction.level0;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("최댓값 만들기 (1)")
class CreateMaxOneTest {

    CreateMaxOne createMaxOne = new CreateMaxOne();

    @Test
    void testCase1() {
        int[] numbers = {1, 2, 3, 4, 5};

        int expected = 20;

        assertThat(createMaxOne.solution(numbers)).isEqualTo(expected);
    }


    @Test
    void testCase2() {
        int[] numbers = {0, 31, 24, 10, 1, 9};

        int expected = 744;

        assertThat(createMaxOne.solution(numbers)).isEqualTo(expected);
    }
}