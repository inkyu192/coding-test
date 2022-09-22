package programmers.hash.level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("폰켓몬")
class PokemonTest {

    Pokemon pokemon = new Pokemon();

    @Test
    void testCase1() {
        int[] nums = {3, 1, 2, 3};

        int expected = 2;

        assertThat(pokemon.solution(nums)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int[] nums = {3, 3, 3, 2, 2, 4};

        int expected = 3;

        assertThat(pokemon.solution(nums)).isEqualTo(expected);
    }

    @Test
    void testCase3() {
        int[] nums = {3, 3, 3, 2, 2, 2};

        int expected = 2;

        assertThat(pokemon.solution(nums)).isEqualTo(expected);
    }
}