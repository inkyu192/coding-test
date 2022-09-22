package programmers.fullsearch.level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("모의고사")
class MockExamTest {

    MockExam mockExam = new MockExam();

    @Test
    void testCase1() {
        int[] answers = {1, 2, 3, 4, 5};

        int[] expected = {1};

        assertThat(mockExam.solution(answers)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int[] answers = {1, 3, 2, 4, 2};

        int[] expected = {1, 2, 3};

        assertThat(mockExam.solution(answers)).isEqualTo(expected);
    }
}