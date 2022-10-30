package programmers.introduction.level0;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("암호 해독")
class DecryptionTest {

    Decryption decryption = new Decryption();

    @Test
    void testCase1() {
        String cipher = "dfjardstddetckdaccccdegk";
        int code = 4;

        String expected = "attack";

        assertThat(decryption.solution(cipher, code)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        String cipher = "pfqallllabwaoclk";
        int code = 2;

        String expected = "fallback";

        assertThat(decryption.solution(cipher, code)).isEqualTo(expected);
    }
}