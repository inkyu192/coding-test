package programmers.level_0.introduction;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("옷가게 할인 받기")
class GetClothingStoreDiscountTest {

    GetClothingStoreDiscount test = new GetClothingStoreDiscount();

    @Test
    void case1() {
        int price = 150000;

        int result = 142500;

        assertThat(test.solution(price)).isEqualTo(result);
    }

    @Test
    void case2() {
        int price = 580000;

        int result = 464000;

        assertThat(test.solution(price)).isEqualTo(result);
    }
}