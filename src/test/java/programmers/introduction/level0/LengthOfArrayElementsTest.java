package programmers.introduction.level0;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("배열 원소의 길이")
class LengthOfArrayElementsTest {

    LengthOfArrayElements lengthOfArrayElements = new LengthOfArrayElements();

    @Test
    void testCase1() {
        String[] strlist = {"We", "are", "the", "world!"};

        int[] expected = {2, 3, 3, 6};

        assertThat(lengthOfArrayElements.solution(strlist)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        String[] strlist = {"I", "Love", "Programmers."};

        int[] expected = {1, 4, 12};

        assertThat(lengthOfArrayElements.solution(strlist)).isEqualTo(expected);
    }
}