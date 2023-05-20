package programmers.level_0.basictraining;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("문자 리스트를 문자열로 변환하기")
class ConvertCharacterListToStringTest {

    ConvertCharacterListToString test = new ConvertCharacterListToString();

    @Test
    void case1() {
        String[] arr = {"a", "b", "c"};

        String result = "abc";

        assertThat(test.solution(arr)).isEqualTo(result);
    }
}