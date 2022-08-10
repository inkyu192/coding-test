package programmers.practice.level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("하샤드 수")
class HarShadNumberTest {

    HarShadNumber harShadNumber = new HarShadNumber();

    @Test
    void testCase1() {
        int arr = 10;

        assertThat(harShadNumber.solution(arr)).isTrue();
    }

    @Test
    void testCase2() {
        int arr = 12;

        assertThat(harShadNumber.solution(arr)).isTrue();
    }

    @Test
    void testCase3() {
        int arr = 11;

        assertThat(harShadNumber.solution(arr)).isFalse();
    }

    @Test
    void testCase4() {
        int arr = 13;

        assertThat(harShadNumber.solution(arr)).isFalse();
    }
}