package programmers.practice.level1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("옹알이 (2)")
class BabblingTwoTest {

    BabblingTwo babblingTwo = new BabblingTwo();

    @Test
    void testCase1() {
        String[] babbling = {"aya", "yee", "u", "maa"};

        int expected = 1;

        assertThat(babblingTwo.solution(babbling)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        String[] babbling = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};

        int expected = 2;

        assertThat(babblingTwo.solution(babbling)).isEqualTo(expected);
    }
}