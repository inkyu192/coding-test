package programmers.stackqueue.level2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("기능개발")
class FunctionDevelopmentTest {

    FunctionDevelopment functionDevelopment = new FunctionDevelopment();

    @Test
    void testCase1() {
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};

        int[] expected = {2, 1};

        assertThat(functionDevelopment.solution(progresses, speeds)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int[] progresses = {95, 90, 99, 99, 80, 99};
        int[] speeds = {1, 1, 1, 1, 1, 1};

        int[] expected = {1, 3, 2};

        assertThat(functionDevelopment.solution(progresses, speeds)).isEqualTo(expected);
    }
}