package programmers.introduction.level0;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("다음에 올 숫자")
class NextNumberTest {

    NextNumber nextNumber = new NextNumber();

    @Test
    void testCase1() {
        int[] common = {1, 2, 3, 4};

        int expected = 5;

        assertThat(nextNumber.solution(common)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int[] common = {2, 4, 8};

        int expected = 16;

        assertThat(nextNumber.solution(common)).isEqualTo(expected);
    }
}