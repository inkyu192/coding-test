package programmers.kakao.level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("[1차] 비밀지도")
class FirstSecretMapTest {

    FirstSecretMap firstSecretMap = new FirstSecretMap();

    @Test
    void testCase1() {
        int n = 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};

        String[] expected = {"#####", "# # #", "### #", "#  ##", "#####"};

        assertThat(firstSecretMap.solution(n, arr1, arr2)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        int n = 6;
        int[] arr1 = {46, 33, 33 ,22, 31, 50};
        int[] arr2 = {27 ,56, 19, 14, 14, 10};

        String[] expected = {"######", "###  #", "##  ##", " #### ", " #####", "### # "};

        assertThat(firstSecretMap.solution(n, arr1, arr2)).isEqualTo(expected);
    }
}