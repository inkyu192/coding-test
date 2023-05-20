package programmers.level_0.introduction;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("저주의 숫자 3")
class CurseNumberThreeTest {

    CurseNumberThree test = new CurseNumberThree();

    @Test
    void case1() {
        int n = 15;

        int result = 25;

        assertThat(test.solution(n)).isEqualTo(result);
    }

    @Test
    void case2() {
        int n = 40;

        int result = 76;

        assertThat(test.solution(n)).isEqualTo(result);
    }
}