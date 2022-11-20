package programmers.practice.level1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("기사단원의 무기")
class WeaponOfTemplarTest {

    WeaponOfTemplar weaponOfTemplar = new WeaponOfTemplar();

    @Test
    void testCase1() {
        int number = 5;
        int limit = 3;
        int power = 2;

        int expected = 10;

        assertThat(weaponOfTemplar.solution(number, limit, power)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int number = 10;
        int limit = 3;
        int power = 2;

        int expected = 21;

        assertThat(weaponOfTemplar.solution(number, limit, power)).isEqualTo(expected);
    }
}