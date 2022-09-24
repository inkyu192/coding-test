package programmers.fullsearch.level2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("카펫")
class CarpetTest {

    Carpet carpet = new Carpet();

    @Test
    void testCase1() {
        int brown = 10;
        int yellow = 2;

        int[] expected = {4, 3};

        assertThat(carpet.solution(brown, yellow)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int brown = 8;
        int yellow = 1;

        int[] expected = {3, 3};

        assertThat(carpet.solution(brown, yellow)).isEqualTo(expected);
    }

    @Test
    void testCase3() {
        int brown = 24;
        int yellow = 24;

        int[] expected = {8, 6};

        assertThat(carpet.solution(brown, yellow)).isEqualTo(expected);
    }
}