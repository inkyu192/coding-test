package programmers.lv1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("최대공약수와 최소공배수")
class GCDAndLCMTest {

    GCDAndLCM gcdAndLCM = new GCDAndLCM();

    @Test
    void testCase1() {
        int n = 3;
        int m = 12;
        int[] answer = gcdAndLCM.solution(n, m);

        assertThat(answer).containsExactly(3, 12);
    }

    @Test
    void testCase2() {
        int n = 2;
        int m = 5;
        int[] answer = gcdAndLCM.solution(n, m);

        assertThat(answer).containsExactly(1, 10);
    }
}