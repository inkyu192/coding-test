package programmers.stackqueue.level2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("프린터")
class PrinterTest {

    Printer printer = new Printer();

    @Test
    void testCase1() {
        int[] priorities = {2, 1, 3, 2};
        int location = 2;

        int expected = 1;

        assertThat(printer.solution(priorities, location)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int[] priorities = {1, 1, 9, 1, 1, 1};
        int location = 0;

        int expected = 5;

        assertThat(printer.solution(priorities, location)).isEqualTo(expected);
    }

    @Test
    void testCase3() {
        int[] priorities = {1, 1, 9, 1, 1, 1};
        int location = 4;

        int expected = 3;

        assertThat(printer.solution(priorities, location)).isEqualTo(expected);
    }
}