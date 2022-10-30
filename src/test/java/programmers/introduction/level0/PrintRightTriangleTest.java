package programmers.introduction.level0;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("직각삼각형 출력하기")
class PrintRightTriangleTest {

    PrintRightTriangle printRightTriangle = new PrintRightTriangle();

    @Test
    void testCase1() {
        int n = 3;

        printRightTriangle.solution(3);
    }
}