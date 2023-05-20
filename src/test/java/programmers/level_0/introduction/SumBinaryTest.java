package programmers.level_0.introduction;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("이진수 더하기")
class SumBinaryTest {

    SumBinary test = new SumBinary();

    @Test
    void case1() {
        String bin1 = "10";
        String bin2 = "11";

        String result = "101";

        assertThat(test.solution(bin1, bin2)).isEqualTo(result);
    }

    @Test
    void case2() {
        String bin1 = "1001";
        String bin2 = "1111";

        String result = "11000";

        assertThat(test.solution(bin1, bin2)).isEqualTo(result);
    }
}