package programmers.level_0.basictraining.calculation;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("문자열 겹쳐쓰기")
class OverwriteStringTest {

    OverwriteString test = new OverwriteString();

    @Test
    void case1() {
        String my_string = "He11oWor1d";
        String overwrite_string = "lloWorl";
        int s = 2;

        String result = "HelloWorld";

        assertThat(test.solution(my_string, overwrite_string, s)).isEqualTo(result);
    }

    @Test
    void case2() {
        String my_string = "Program29b8UYP";
        String overwrite_string = "merS123";
        int s = 7;

        String result = "ProgrammerS123";

        assertThat(test.solution(my_string, overwrite_string, s)).isEqualTo(result);
    }
}