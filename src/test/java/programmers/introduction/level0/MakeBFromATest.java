package programmers.introduction.level0;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("A로 B 만들기")
class MakeBFromATest {

    MakeBFromA makeBFromA = new MakeBFromA();

    @Test
    void testCase1() {
        String before = "olleh";
        String after = "hello";

        int expected = 1;

        assertThat(makeBFromA.solution(before, after)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        String before = "allpe";
        String after = "apple";

        int expected = 0;

        assertThat(makeBFromA.solution(before, after)).isEqualTo(expected);
    }
}