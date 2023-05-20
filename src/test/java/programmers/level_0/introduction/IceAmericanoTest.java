package programmers.level_0.introduction;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("아이스 아메리카노")
class IceAmericanoTest {

    IceAmericano test = new IceAmericano();

    @Test
    void case1() {
        int money = 5500;

        int[] result = {1, 0};

        assertThat(test.solution(money)).isEqualTo(result);
    }

    @Test
    void case2() {
        int money = 15000;

        int[] result = {2, 4000};

        assertThat(test.solution(money)).isEqualTo(result);
    }
}