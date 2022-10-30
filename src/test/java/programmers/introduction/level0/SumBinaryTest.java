package programmers.introduction.level0;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("이진수 더하기")
class SumBinaryTest {

    SumBinary sumBinary = new SumBinary();

    @Test
    void testCase1() {
        String bin1 = "10";
        String bin2 = "11";

        String expected = "101";

        assertThat(sumBinary.solution(bin1, bin2)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        String bin1 = "1001";
        String bin2 = "1111";

        String expected = "11000";

        assertThat(sumBinary.solution(bin1, bin2)).isEqualTo(expected);
    }
}