package programmers.practice.level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("하샤드 수")
class HarshadNumberTest {

    HarshadNumber harshadNumber = new HarshadNumber();

    @Test
    void testCase1() {
        int arr = 10;

        assertThat(harshadNumber.solution(arr)).isTrue();
    }

    @Test
    void testCase2() {
        int arr = 12;

        assertThat(harshadNumber.solution(arr)).isTrue();
    }

    @Test
    void testCase3() {
        int arr = 11;

        assertThat(harshadNumber.solution(arr)).isFalse();
    }

    @Test
    void testCase4() {
        int arr = 13;

        assertThat(harshadNumber.solution(arr)).isFalse();
    }
}