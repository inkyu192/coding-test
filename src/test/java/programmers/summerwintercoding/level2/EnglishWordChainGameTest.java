package programmers.summerwintercoding.level2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("영어 끝말잇기")
class EnglishWordChainGameTest {

    EnglishWordChainGame englishWordChainGame = new EnglishWordChainGame();

    @Test
    void testCase1() {
        int n = 3;
        String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};

        int[] expected = {3, 3};

        assertThat(englishWordChainGame.solution(n, words)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int n = 5;
        String[] words = {"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"};

        int[] expected = {0, 0};

        assertThat(englishWordChainGame.solution(n, words)).isEqualTo(expected);
    }

    @Test
    void testCase3() {
        int n = 2;
        String[] words = {"hello", "one", "even", "never", "now", "world", "draw"};

        int[] expected = {1, 3};

        assertThat(englishWordChainGame.solution(n, words)).isEqualTo(expected);
    }
}