package programmers.level_0.introduction;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("점의 위치 구하기")
class FindPositionOfPointTest {

    FindPositionOfPoint test = new FindPositionOfPoint();

    @Test
    void case1() {
        int[] dot = {2, 4};

        int result = 1;

        assertThat(test.solution(dot)).isEqualTo(result);
    }


    @Test
    void case2() {
        int[] dot = {-7, 9};

        int result = 2;

        assertThat(test.solution(dot)).isEqualTo(result);
    }
}