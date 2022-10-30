package programmers.introduction.level0;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("잘라서 배열로 저장하기")
class CutAndSaveArrayTest {

    CutAndSaveArray cutAndSaveArray = new CutAndSaveArray();

    @Test
    void testCase1() {
        String my_str = "abc1Addfggg4556b";
        int n = 6;

        String[] expected = {"abc1Ad", "dfggg4", "556b"};

        assertThat(cutAndSaveArray.solution(my_str, n)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        String my_str = "abcdef123";
        int n = 3;

        String[] expected = {"abc", "def", "123"};

        assertThat(cutAndSaveArray.solution(my_str, n)).isEqualTo(expected);
    }
}