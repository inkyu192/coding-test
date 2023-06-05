package programmers.level_0.basictraining.condition;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("수 조작하기 1")
class ManipulateTheNumber1Test {

    ManipulateTheNumber1 test = new ManipulateTheNumber1();

    @Test
    void case1() {
        int n = 0;
        String control = "wsdawsdassw";

        int result = -1;

        assertThat(test.solution(n, control)).isEqualTo(result);
    }
}