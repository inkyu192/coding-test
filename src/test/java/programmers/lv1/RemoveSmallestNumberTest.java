package programmers.lv1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("제일 작은 수 제거하기")
class RemoveSmallestNumberTest {

    RemoveSmallestNumber removeSmallestNumber = new RemoveSmallestNumber();

    @Test
    void testCase1() {
        int[] arr = new int[]{4, 3, 2, 1};

        assertThat(removeSmallestNumber.solution(arr)).containsExactly(4, 3, 2);
    }

    @Test
    void testCase2() {
        int[] arr = new int[]{10};

        assertThat(removeSmallestNumber.solution(arr)).containsExactly(-1);
    }

    @Test
    void testCase3() {
        int[] arr = new int[]{4, -10, 3, -15, 2, 1};

        assertThat(removeSmallestNumber.solution(arr)).containsExactly(4, -10, 3, 2, 1);
    }
}