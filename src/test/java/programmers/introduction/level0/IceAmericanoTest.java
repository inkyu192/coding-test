package programmers.introduction.level0;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("아이스 아메리카노")
class IceAmericanoTest {

    IceAmericano iceAmericano = new IceAmericano();

    @Test
    void testCase1() {
        int money = 5500;

        int[] expected = {1, 0};

        assertThat(iceAmericano.solution(money)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int money = 15000;

        int[] expected = {2, 4000};

        assertThat(iceAmericano.solution(money)).isEqualTo(expected);
    }
}