package programmers.introduction.level0;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("영어가 싫어요")
class HateEnglishTest {

    HateEnglish hateEnglish = new HateEnglish();

    @Test
    void testCase1() {
        String numbers = "onetwothreefourfivesixseveneightnine";

        long expected = 123456789;

        assertThat(hateEnglish.solution(numbers)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        String numbers = "onefourzerosixseven";

        long expected = 14067;

        assertThat(hateEnglish.solution(numbers)).isEqualTo(expected);
    }
}