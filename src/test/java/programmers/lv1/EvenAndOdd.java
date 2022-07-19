package programmers.lv1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class EvenAndOdd {

    @Test
    void solution() {
        String answer = "";

        int num1 = 3;
        answer = num1 % 2 == 0 ? "Even" : "Odd";
        Assertions.assertThat(answer).isEqualTo("Odd");

        int num2 = 4;
        answer = num2 % 2 == 0 ? "Even" : "Odd";
        Assertions.assertThat(answer).isEqualTo("Even");
    }
}
