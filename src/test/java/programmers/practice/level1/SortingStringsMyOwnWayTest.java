package programmers.practice.level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("문자열 내 마음대로 정렬하기")
class SortingStringsMyOwnWayTest {

    SortingStringsMyOwnWay sortingStringsMyOwnWay = new SortingStringsMyOwnWay();

    @Test
    void testCase1() {
        String[] strings = {"sun", "bed", "car"};
        int n = 1;

        String[] expected = {"car", "bed", "sun"};

        assertThat(sortingStringsMyOwnWay.solution(strings, n)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        String[] strings = {"abce", "abcd", "cdx"};
        int n = 2;

        String[] expected = {"abcd", "abce", "cdx"};

        assertThat(sortingStringsMyOwnWay.solution(strings, n)).isEqualTo(expected);
    }
}