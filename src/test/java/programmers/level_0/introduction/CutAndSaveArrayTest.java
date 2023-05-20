package programmers.level_0.introduction;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("잘라서 배열로 저장하기")
class CutAndSaveArrayTest {

    CutAndSaveArray test = new CutAndSaveArray();

    @Test
    void case1() {
        String my_str = "abc1Addfggg4556b";
        int n = 6;

        String[] result = {"abc1Ad", "dfggg4", "556b"};

        assertThat(test.solution(my_str, n)).isEqualTo(result);
    }

    @Test
    void case2() {
        String my_str = "abcdef123";
        int n = 3;

        String[] result = {"abc", "def", "123"};

        assertThat(test.solution(my_str, n)).isEqualTo(result);
    }
}