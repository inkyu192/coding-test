package programmers.introduction.level0;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("머쓱이보다 키 큰 사람")
class TallPersonThanShyPersonTest {

    TallPersonThanShyPerson tallPersonThanShyPerson = new TallPersonThanShyPerson();

    @Test
    void testCase1() {
        int[] array = {149, 180, 192, 170};
        int height = 167;

        int expected = 3;

        assertThat(tallPersonThanShyPerson.solution(array, height)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int[] array = {180, 120, 140};
        int height = 190;

        int expected = 0;

        assertThat(tallPersonThanShyPerson.solution(array, height)).isEqualTo(expected);
    }
}