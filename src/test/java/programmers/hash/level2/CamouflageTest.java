package programmers.hash.level2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("위장")
class CamouflageTest {

    Camouflage camouflage = new Camouflage();

    @Test
    void testCase1() {
        String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};

        int expected = 5;

        assertThat(camouflage.solution(clothes)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        String[][] clothes = {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};

        int expected = 3;

        assertThat(camouflage.solution(clothes)).isEqualTo(expected);
    }
}