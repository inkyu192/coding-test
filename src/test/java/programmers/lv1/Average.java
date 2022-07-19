package programmers.lv1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class Average {

    @Test
    void solution() {
        double answer = 0;

        int[] arr1 = {1, 2, 3, 4};
        answer = Arrays.stream(arr1).average().orElse(0.0);
        assertThat(answer).isEqualTo(2.5);

        int[] arr2 = {5, 5};
        answer = Arrays.stream(arr2).average().orElse(0.0);
        assertThat(answer).isEqualTo(5);

        int[] arr3 = {-5, -5};
        answer = Arrays.stream(arr3).average().orElse(0.0);
        assertThat(answer).isEqualTo(-5);
    }
}
