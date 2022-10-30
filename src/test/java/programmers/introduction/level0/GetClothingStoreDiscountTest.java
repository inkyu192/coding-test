package programmers.introduction.level0;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("옷가게 할인 받기")
class GetClothingStoreDiscountTest {

    GetClothingStoreDiscount getClothingStoreDiscount = new GetClothingStoreDiscount();

    @Test
    void testCase1() {
        int price = 150000;

        int expected = 142500;

        assertThat(getClothingStoreDiscount.solution(price)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int price = 580000;

        int expected = 464000;

        assertThat(getClothingStoreDiscount.solution(price)).isEqualTo(expected);
    }
}