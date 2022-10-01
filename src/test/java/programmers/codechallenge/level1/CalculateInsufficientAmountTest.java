package programmers.codechallenge.level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("부족한 금액 계산하기")
class CalculateInsufficientAmountTest {

    CalculateInsufficientAmount calculateInsufficientAmount = new CalculateInsufficientAmount();

    @Test
    void testCase1() {
        int price = 3;
        int money = 20;
        int count = 4;

        long expected = 10;

        assertThat(calculateInsufficientAmount.solution(price, money, count)).isEqualTo(expected);
    }
}