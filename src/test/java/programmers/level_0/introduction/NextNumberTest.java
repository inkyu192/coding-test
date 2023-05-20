package programmers.level_0.introduction;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("다음에 올 숫자")
class NextNumberTest {

    NextNumber test = new NextNumber();

    @Test
    void case1() {
        int[] common = {1, 2, 3, 4};

        int result = 5;

        assertThat(test.solution(common)).isEqualTo(result);
    }

    @Test
    void case2() {
        int[] common = {2, 4, 8};

        int result = 16;

        assertThat(test.solution(common)).isEqualTo(result);
    }
}