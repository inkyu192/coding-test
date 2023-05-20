package programmers.level_0.introduction;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("나이 출력")
class AgeOutputTest {

    AgeOutput test = new AgeOutput();

    @Test
    void case1() {
        int age = 40;

        int result = 1983;

        assertThat(test.solution(age)).isEqualTo(result);
    }

    @Test
    void case2() {
        int age = 23;

        int result = 2000;

        assertThat(test.solution(age)).isEqualTo(result);
    }
}