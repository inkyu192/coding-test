package programmers.level_0.introduction;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("치킨 쿠폰")
class ChickenCouponTest {

    ChickenCoupon test = new ChickenCoupon();

    @Test
    void case1() {
        int chicken = 100;

        int result = 11;

        assertThat(test.solution(chicken)).isEqualTo(result);
    }

    @Test
    void case2() {
        int chicken = 1081;

        int result = 120;

        assertThat(test.solution(chicken)).isEqualTo(result);
    }
}