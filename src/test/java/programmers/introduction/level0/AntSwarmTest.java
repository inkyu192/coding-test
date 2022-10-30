package programmers.introduction.level0;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("개미 군단")
class AntSwarmTest {

    AntSwarm antSwarm = new AntSwarm();

    @Test
    void testCase1() {
        int hp = 23;

        int expected = 5;

        assertThat(antSwarm.solution(hp)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int hp = 24;

        int expected = 6;

        assertThat(antSwarm.solution(hp)).isEqualTo(expected);
    }

    @Test
    void testCase3() {
        int hp = 999;

        int expected = 201;

        assertThat(antSwarm.solution(hp)).isEqualTo(expected);
    }
}