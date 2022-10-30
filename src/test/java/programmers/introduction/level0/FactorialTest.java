package programmers.introduction.level0;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("팩토리얼")
class FactorialTest {

    Factorial factorial = new Factorial();

    @Test
    void testCase1() {
        int n = 3628800;

        int expected = 10;

        assertThat(factorial.solution(n)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int n = 7;

        int expected = 3;

        assertThat(factorial.solution(n)).isEqualTo(expected);
    }
}