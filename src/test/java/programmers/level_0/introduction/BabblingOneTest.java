package programmers.level_0.introduction;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("옹알이 (1)")
class BabblingOneTest {

    BabblingOne test = new BabblingOne();

    @Test
    void case1() {
        String[] babbling = {"aya", "yee", "u", "maa", "wyeoo"};

        int result = 1;

        assertThat(test.solution(babbling)).isEqualTo(result);
    }

    @Test
    void case2() {
        String[] babbling = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};

        int result = 3;

        assertThat(test.solution(babbling)).isEqualTo(result);
    }
}