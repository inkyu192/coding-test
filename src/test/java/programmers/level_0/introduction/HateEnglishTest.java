package programmers.level_0.introduction;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("영어가 싫어요")
class HateEnglishTest {

    HateEnglish test = new HateEnglish();

    @Test
    void case1() {
        String numbers = "onetwothreefourfivesixseveneightnine";

        long result = 123456789;

        assertThat(test.solution(numbers)).isEqualTo(result);
    }

    @Test
    void case2() {
        String numbers = "onefourzerosixseven";

        long result = 14067;

        assertThat(test.solution(numbers)).isEqualTo(result);
    }
}