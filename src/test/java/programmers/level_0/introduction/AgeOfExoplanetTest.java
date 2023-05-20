package programmers.level_0.introduction;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("외계행성의 나이")
class AgeOfExoplanetTest {

    AgeOfExoplanet test = new AgeOfExoplanet();

    @Test
    void case1() {
        int age = 23;

        String result = "cd";

        assertThat(test.solution(age)).isEqualTo(result);
    }

    @Test
    void case2() {
        int age = 51;

        String result = "fb";

        assertThat(test.solution(age)).isEqualTo(result);
    }

    @Test
    void case3() {
        int age = 100;

        String result = "baa";

        assertThat(test.solution(age)).isEqualTo(result);
    }
}