package programmers.lv1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("직사각형 별찍기")
class RectangularStarOutputTest {

    RectangularStarOutput rectangularStarOutput = new RectangularStarOutput();

    @Test
    void testCase1() {
        rectangularStarOutput.solution(5, 3);
    }

    @Test
    void testCase2() {
        rectangularStarOutput.solution(2, 2);
    }
}