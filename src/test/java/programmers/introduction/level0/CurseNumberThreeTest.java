package programmers.introduction.level0;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("저주의 숫자 3")
class CurseNumberThreeTest {

    CurseNumberThree curseNumberThree = new CurseNumberThree();

    @Test
    void testCase1() {
        int n = 15;

        int expected = 25;

        assertThat(curseNumberThree.solution(n)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int n = 40;

        int expected = 76;

        assertThat(curseNumberThree.solution(n)).isEqualTo(expected);
    }
}