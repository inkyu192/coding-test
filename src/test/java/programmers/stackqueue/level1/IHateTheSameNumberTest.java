package programmers.stackqueue.level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("같은 숫자는 싫어")
class IHateTheSameNumberTest {

    IHateTheSameNumber iHateTheSameNumber = new IHateTheSameNumber();

    @Test
    void testCase1() {
        int[] arr = {1, 1, 3, 3, 0, 1, 1};

        int[] expected = {1, 3, 0, 1};

        assertThat(iHateTheSameNumber.solution(arr)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int[] arr = {4, 4, 4, 3, 3};

        int[] expected = {4, 3};

        assertThat(iHateTheSameNumber.solution(arr)).isEqualTo(expected);
    }
}