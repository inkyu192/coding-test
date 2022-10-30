package programmers.introduction.level0;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("외계행성의 나이")
class AgeOfExoplanetTest {

    AgeOfExoplanet ageOfExoplanet = new AgeOfExoplanet();

    @Test
    void testCase1() {
        int age = 23;

        String expected = "cd";

        assertThat(ageOfExoplanet.solution(age)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int age = 51;

        String expected = "fb";

        assertThat(ageOfExoplanet.solution(age)).isEqualTo(expected);
    }

    @Test
    void testCase3() {
        int age = 100;

        String expected = "baa";

        assertThat(ageOfExoplanet.solution(age)).isEqualTo(expected);
    }
}