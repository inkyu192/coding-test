package programmers.practice.level1;

import java.util.Arrays;

public class PlaceStringDescending {

    public String solution(String s) {
        StringBuilder sb = new StringBuilder();

        String[] split = s.split("");
        Arrays.sort(split);

        for (String value : split) {
            sb.append(value);
        }

        return sb.reverse().toString();
    }
}
