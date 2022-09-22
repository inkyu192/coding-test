package programmers.practice.level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("시저 암호")
class CaesarCipherTest {

    CaesarCipher caesarCipher = new CaesarCipher();

    @Test
    void testCase1() {
        String s = "AB";
        int n = 1;

        String expected = "BC";

        assertThat(caesarCipher.solution(s, n)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        String s = "z";
        int n = 1;

        String expected = "a";

        assertThat(caesarCipher.solution(s, n)).isEqualTo(expected);
    }
    @Test
    void testCase3() {
        String s = "a B z";
        int n = 4;

        String expected = "e F d";

        assertThat(caesarCipher.solution(s, n)).isEqualTo(expected);
    }
}