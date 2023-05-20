package programmers.level_0.introduction;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("가위 바위 보")
class RockPaperScissorsTest {

    RockPaperScissors test = new RockPaperScissors();

    @Test
    void case1() {
        String rsp = "2";

        String result = "0";

        assertThat(test.solution(rsp)).isEqualTo(result);
    }

    @Test
    void case2() {
        String rsp = "205";

        String result = "052";

        assertThat(test.solution(rsp)).isEqualTo(result);
    }
}