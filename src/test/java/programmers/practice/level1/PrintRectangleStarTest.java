package programmers.practice.level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("직사각형 별찍기")
class PrintRectangleStarTest {

    PrintRectangleStar printRectangleStar = new PrintRectangleStar();

    @Test
    void testCase1() {
        printRectangleStar.solution(5, 3);
    }

    @Test
    void testCase2() {
        printRectangleStar.solution(2, 2);
    }
}