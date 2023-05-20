package programmers.level_0.introduction;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("직각삼각형 출력하기")
class PrintRightTriangleTest {

    PrintRightTriangle test = new PrintRightTriangle();

    @Test
    void case1() {
        int n = 3;

        test.solution(3);
    }
}