package programmers.stackqueue.level2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("주식가격")
class StockPriceTest {

    StockPrice stockPrice = new StockPrice();

    @Test
    void testCase1() {
        int[] prices = {1, 2, 3, 2, 3};

        int[] expected = {4, 3, 1, 1, 0};

        assertThat(stockPrice.solution(prices)).isEqualTo(expected);
    }
}