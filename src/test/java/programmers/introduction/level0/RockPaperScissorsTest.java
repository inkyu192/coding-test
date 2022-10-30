package programmers.introduction.level0;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("가위 바위 보")
class RockPaperScissorsTest {

    RockPaperScissors rockPaperScissors = new RockPaperScissors();

    @Test
    void testCase1() {
        String rsp = "2";

        String expected = "0";

        assertThat(rockPaperScissors.solution(rsp)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        String rsp = "205";

        String expected = "052";

        assertThat(rockPaperScissors.solution(rsp)).isEqualTo(expected);
    }
}