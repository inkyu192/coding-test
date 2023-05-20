package programmers.level_0.introduction;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("머쓱이보다 키 큰 사람")
class TallPersonThanShyPersonTest {

    TallPersonThanShyPerson test = new TallPersonThanShyPerson();

    @Test
    void case1() {
        int[] array = {149, 180, 192, 170};
        int height = 167;

        int result = 3;

        assertThat(test.solution(array, height)).isEqualTo(result);
    }

    @Test
    void case2() {
        int[] array = {180, 120, 140};
        int height = 190;

        int result = 0;

        assertThat(test.solution(array, height)).isEqualTo(result);
    }
}