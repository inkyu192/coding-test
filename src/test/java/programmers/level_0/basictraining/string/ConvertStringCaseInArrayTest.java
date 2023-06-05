package programmers.level_0.basictraining.string;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("배열에서 문자열 대소문자 변환하기")
class ConvertStringCaseInArrayTest {

    ConvertStringCaseInArray test = new ConvertStringCaseInArray();

    @Test
    void case1() {
        String[] strArr = {"AAA", "BBB", "CCC", "DDD"};

        String[] result = {"aaa", "BBB", "ccc", "DDD"};

        assertThat(test.solution(strArr)).isEqualTo(result);
    }

    @Test
    void case2() {
        String[] strArr = {"aBc", "AbC"};

        String[] result = {"abc", "ABC"};

        assertThat(test.solution(strArr)).isEqualTo(result);
    }
}