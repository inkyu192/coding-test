package programmers.level_0.basictraining.string;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("A 강조하기")
class AEmphasizeTest {

    AEmphasize test = new AEmphasize();

    @Test
    void case1() {
        String myString = "abstract algebra";

        String result = "AbstrAct AlgebrA";

        assertThat(test.solution(myString)).isEqualTo(result);
    }

    @Test
    void case2() {
        String myString = "PrOgRaMmErS";

        String result = "progrAmmers";

        assertThat(test.solution(myString)).isEqualTo(result);
    }
}