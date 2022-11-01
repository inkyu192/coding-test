package programmers.introduction.level0;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("치킨 쿠폰")
class ChickenCouponTest {

    ChickenCoupon chickenCoupon = new ChickenCoupon();

    @Test
    void testCase1() {
        int chicken = 100;

        int expected = 11;

        assertThat(chickenCoupon.solution(chicken)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int chicken = 1081;

        int expected = 120;

        assertThat(chickenCoupon.solution(chicken)).isEqualTo(expected);
    }
}