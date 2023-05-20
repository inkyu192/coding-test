package programmers.level_0.introduction;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("개미 군단")
class AntSwarmTest {

    AntSwarm antSwarm = new AntSwarm();

    @Test
    void case1() {
        int hp = 23;

        int result = 5;

        assertThat(antSwarm.solution(hp)).isEqualTo(result);
    }

    @Test
    void case2() {
        int hp = 24;

        int result = 6;

        assertThat(antSwarm.solution(hp)).isEqualTo(result);
    }

    @Test
    void case3() {
        int hp = 999;

        int result = 201;

        assertThat(antSwarm.solution(hp)).isEqualTo(result);
    }
}