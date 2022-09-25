package programmers.practice.level1;

import java.util.Arrays;
import java.util.Collections;

public class PlaceIntegerDescending {

    public long solution(long n) {
        String[] split = String.valueOf(n).split("");

        Arrays.sort(split, Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for (String s1 : split) {
            sb.append(s1);
        }

        return Long.parseLong(sb.toString());
    }
}
