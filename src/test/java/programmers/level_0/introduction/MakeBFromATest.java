package programmers.level_0.introduction;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("A로 B 만들기")
class MakeBFromATest {

    MakeBFromA test = new MakeBFromA();

    @Test
    void case1() {
        String before = "olleh";
        String after = "hello";

        int result = 1;

        assertThat(test.solution(before, after)).isEqualTo(result);
    }

    @Test
    void case2() {
        String before = "allpe";
        String after = "apple";

        int result = 0;

        assertThat(test.solution(before, after)).isEqualTo(result);
    }
}