package programmers.practice.level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("자연수 뒤집어 배열로 만들기")
class NaturalNumberToArrayTest {

    NaturalNumberToArray naturalNumberToArray = new NaturalNumberToArray();

    @Test
    void testCase1() {
        long n = 12345;

        int[] expected = {5, 4, 3, 2, 1};

        assertThat(naturalNumberToArray.solution(n)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        long n = 91735;

        int[] expected = {5, 3, 7, 1, 9};

        assertThat(naturalNumberToArray.solution(n)).isEqualTo(expected);
    }
}