package programmers.practice.level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("서울에서 김서방 찾기")
class FindKimSeoBangInSeoulTest {

    FindKimSeoBangInSeoul findKimSeoBangInSeoul = new FindKimSeoBangInSeoul();

    @Test
    void testCase1() {
        String[] seoul = {"Jane", "Kim"};

        String expected = "김서방은 1에 있다";

        assertThat(findKimSeoBangInSeoul.solution(seoul)).isEqualTo(expected);
    }
}