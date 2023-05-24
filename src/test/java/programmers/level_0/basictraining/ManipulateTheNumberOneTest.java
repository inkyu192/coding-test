package programmers.level_0.basictraining;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("수 조작하기 1")
class ManipulateTheNumberOneTest {

    ManipulateTheNumberOne test = new ManipulateTheNumberOne();

    @Test
    void case1() {
        int n = 0;
        String control = "wsdawsdassw";

        int result = -1;

        assertThat(test.solution(n, control)).isEqualTo(result);
    }
}