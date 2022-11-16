package programmers.practice.level1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("햄버거 만들기")
class MakeHamburgerTest {

    MakeHamburger makeHamburger = new MakeHamburger();

    @Test
    void testCase1() {
        int[] ingredient = {2, 1, 1, 2, 3, 1, 2, 3, 1};

        int expected = 2;

        assertThat(makeHamburger.solution(ingredient)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int[] ingredient = {1, 3, 2, 1, 2, 1, 3, 1, 2};

        int expected = 0;

        assertThat(makeHamburger.solution(ingredient)).isEqualTo(expected);
    }
}