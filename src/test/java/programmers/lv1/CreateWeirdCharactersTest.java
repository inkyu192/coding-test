package programmers.lv1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("이상한 문자 만들기")
class CreateWeirdCharactersTest {

    CreateWeirdCharacters createWeirdCharacters = new CreateWeirdCharacters();

    @Test
    void testCase1() {
        String s = "try hello world";

        String expected = "TrY HeLlO WoRlD";

        assertThat(createWeirdCharacters.solution(s)).isEqualTo(expected);
    }
}