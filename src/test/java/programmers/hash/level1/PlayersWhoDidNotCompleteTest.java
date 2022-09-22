package programmers.hash.level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("완주하지 못한 선수")
class PlayersWhoDidNotCompleteTest {

    PlayersWhoDidNotComplete playersWhoDidNotComplete = new PlayersWhoDidNotComplete();

    @Test
    void testCase1() {
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};

        String expected = "leo";

        assertThat(playersWhoDidNotComplete.solution(participant, completion)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion = {"josipa", "filipa", "marina", "nikola"};

        String expected = "vinko";

        assertThat(playersWhoDidNotComplete.solution(participant, completion)).isEqualTo(expected);
    }

    @Test
    void testCase3() {
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};

        String expected = "mislav";

        assertThat(playersWhoDidNotComplete.solution(participant, completion)).isEqualTo(expected);
    }
}