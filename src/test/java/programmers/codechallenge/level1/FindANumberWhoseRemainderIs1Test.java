package programmers.codechallenge.level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("나머지가 1이 되는 수 찾기")
class FindANumberWhoseRemainderIs1Test {

    FindANumberWhoseRemainderIs1 findANumberWhoseRemainderIs1 = new FindANumberWhoseRemainderIs1();

    @Test
    void testCase1() {
        int n = 10;

        int expected = 3;

        assertThat(findANumberWhoseRemainderIs1.solution(n)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int n = 12;

        int expected = 11;

        assertThat(findANumberWhoseRemainderIs1.solution(n)).isEqualTo(expected);
    }
}