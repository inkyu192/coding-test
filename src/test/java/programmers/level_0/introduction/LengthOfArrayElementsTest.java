package programmers.level_0.introduction;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("배열 원소의 길이")
class LengthOfArrayElementsTest {

    LengthOfArrayElements test = new LengthOfArrayElements();

    @Test
    void case1() {
        String[] strlist = {"We", "are", "the", "world!"};

        int[] result = {2, 3, 3, 6};

        assertThat(test.solution(strlist)).isEqualTo(result);
    }

    @Test
    void case2() {
        String[] strlist = {"I", "Love", "Programmers."};

        int[] result = {1, 4, 12};

        assertThat(test.solution(strlist)).isEqualTo(result);
    }
}