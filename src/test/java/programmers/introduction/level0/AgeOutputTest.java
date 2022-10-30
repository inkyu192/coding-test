package programmers.introduction.level0;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("나이 출력")
class AgeOutputTest {

    AgeOutput ageOutput = new AgeOutput();

    @Test
    void testCase1() {
        int age = 40;

        int expected = 1983;

        assertThat(ageOutput.solution(age)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int age = 23;

        int expected = 2000;

        assertThat(ageOutput.solution(age)).isEqualTo(expected);
    }
}