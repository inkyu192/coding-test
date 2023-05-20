package programmers.level_0.introduction;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("암호 해독")
class DecryptionTest {

    Decryption test = new Decryption();

    @Test
    void case1() {
        String cipher = "dfjardstddetckdaccccdegk";
        int code = 4;

        String result = "attack";

        assertThat(test.solution(cipher, code)).isEqualTo(result);
    }

    @Test
    void case2() {
        String cipher = "pfqallllabwaoclk";
        int code = 2;

        String result = "fallback";

        assertThat(test.solution(cipher, code)).isEqualTo(result);
    }
}