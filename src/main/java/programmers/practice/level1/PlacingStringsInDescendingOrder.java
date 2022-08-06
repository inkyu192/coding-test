package programmers.practice.level1;

import java.util.Arrays;

public class PlacingStringsInDescendingOrder {

    public String solution(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        String answer = new StringBuilder(new String(arr)).reverse().toString();

        return answer;
    }
}
