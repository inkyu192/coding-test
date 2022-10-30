package programmers.introduction.level0;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("점의 위치 구하기")
class FindPositionOfPointTest {

    FindPositionOfPoint findPositionOfPoint = new FindPositionOfPoint();

    @Test
    void testCase1() {
        int[] dot = {2, 4};

        int expected = 1;

        assertThat(findPositionOfPoint.solution(dot)).isEqualTo(expected);
    }


    @Test
    void testCase2() {
        int[] dot = {-7, 9};

        int expected = 2;

        assertThat(findPositionOfPoint.solution(dot)).isEqualTo(expected);
    }
}