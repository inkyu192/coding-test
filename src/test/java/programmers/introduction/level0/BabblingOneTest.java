package programmers.introduction.level0;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("옹알이 (1)")
class BabblingOneTest {

    BabblingOne babblingOne = new BabblingOne();

    @Test
    void testCase1() {
        String[] babbling = {"aya", "yee", "u", "maa", "wyeoo"};

        int expected = 1;

        assertThat(babblingOne.solution(babbling)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        String[] babbling = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};

        int expected = 3;

        assertThat(babblingOne.solution(babbling)).isEqualTo(expected);
    }
}