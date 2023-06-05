package programmers.level_0.basictraining.string;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("rny_string")
class RnyStringTest {

    RnyString test = new RnyString();

    @Test
    void case1() {
        String rny_string = "masterpiece";

        String result = "rnasterpiece";

        assertThat(test.solution(rny_string)).isEqualTo(result);
    }

    @Test
    void case2() {
        String rny_string = "programmers";

        String result = "prograrnrners";

        assertThat(test.solution(rny_string)).isEqualTo(result);
    }

    @Test
    void case3() {
        String rny_string = "jerry";

        String result = "jerry";

        assertThat(test.solution(rny_string)).isEqualTo(result);
    }

    @Test
    void case4() {
        String rny_string = "burn";

        String result = "burn";

        assertThat(test.solution(rny_string)).isEqualTo(result);
    }
}