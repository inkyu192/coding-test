package programmers.practice.level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("정수 내림차순으로 배치하기")
class PlacingIntegersInDescendingOrderTest {

    PlacingIntegersInDescendingOrder placingIntegersInDescendingOrder = new PlacingIntegersInDescendingOrder();

    @Test
    void testCase1() {
        int n = 118372;

        long expected = 873211;

        assertThat(placingIntegersInDescendingOrder.solution(n)).isEqualTo(expected);
    }
}