package programmers.codechallenge.level2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("이진 변환 반복하기")
class RepeatBinaryConversionTest {

    RepeatBinaryConversion repeatBinaryConversion = new RepeatBinaryConversion();

    @Test
    void testCase1() {
        String s = "110010101001";

        int[] expected = {3, 8};

        assertThat(repeatBinaryConversion.solution(s)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        String s = "01110";

        int[] expected = {3, 3};

        assertThat(repeatBinaryConversion.solution(s)).isEqualTo(expected);
    }

    @Test
    void testCase3() {
        String s = "1111111";

        int[] expected = {4, 1};

        assertThat(repeatBinaryConversion.solution(s)).isEqualTo(expected);
    }
}