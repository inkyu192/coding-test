package programmers.kakao.level1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("성격 유형 검사하기")
class PersonalityTypeCheckTest {

    PersonalityTypeCheck personalityTypeCheck = new PersonalityTypeCheck();

    @Test
    void testCase1() {
        String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
        int[] choices = {5, 3, 2, 7, 5};

        String expected = "TCMA";

        assertThat(personalityTypeCheck.solution(survey, choices)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        String[] survey = {"TR", "RT", "TR"};
        int[] choices = {7, 1, 3};

        String expected = "RCJA";

        assertThat(personalityTypeCheck.solution(survey, choices)).isEqualTo(expected);
    }
}