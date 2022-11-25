package programmers.kakao.level2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("[1차] 캐시")
class FirstCacheTest {

    FirstCache firstCache = new FirstCache();

    @Test
    void testCase1() {
        int cacheSize = 3;
        String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"};

        int expected = 50;

        assertThat(firstCache.solution(cacheSize, cities)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int cacheSize = 3;
        String[] cities = {"Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"};

        int expected = 21;

        assertThat(firstCache.solution(cacheSize, cities)).isEqualTo(expected);
    }

    @Test
    void testCase3() {
        int cacheSize = 2;
        String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"};

        int expected = 60;

        assertThat(firstCache.solution(cacheSize, cities)).isEqualTo(expected);
    }

    @Test
    void testCase4() {
        int cacheSize = 5;
        String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"};

        int expected = 52;

        assertThat(firstCache.solution(cacheSize, cities)).isEqualTo(expected);
    }

    @Test
    void testCase5() {
        int cacheSize = 2;
        String[] cities = {"Jeju", "Pangyo", "NewYork", "newyork"};

        int expected = 16;

        assertThat(firstCache.solution(cacheSize, cities)).isEqualTo(expected);
    }

    @Test
    void testCase6() {
        int cacheSize = 0;
        String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA"};

        int expected = 25;

        assertThat(firstCache.solution(cacheSize, cities)).isEqualTo(expected);
    }
}