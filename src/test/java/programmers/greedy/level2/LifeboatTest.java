package programmers.greedy.level2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("구명보트")
class LifeboatTest {

    Lifeboat lifeboat = new Lifeboat();

    @Test
    void testCase1() {
        int[] people = {70, 50, 80, 50};
        int limit = 100;

        int expected = 3;

        assertThat(lifeboat.solution(people, limit)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int[] people = {70, 80, 50};
        int limit = 100;

        int expected = 3;

        assertThat(lifeboat.solution(people, limit)).isEqualTo(expected);
    }
}