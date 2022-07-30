package programmers.lv1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("소수 만들기")
class MakeAPrimeNumberTest {

    MakeAPrimeNumber makeAPrimeNumber = new MakeAPrimeNumber();

    @Test
    void testCase1() {
        int[] nums = {1, 2, 3, 4};

        int expected = 1;

        assertThat(makeAPrimeNumber.solution(nums)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int[] nums = {1, 2, 7, 6, 4};

        int expected = 4;

        assertThat(makeAPrimeNumber.solution(nums)).isEqualTo(expected);
    }
}