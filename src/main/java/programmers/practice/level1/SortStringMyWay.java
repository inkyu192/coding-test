package programmers.practice.level1;

import java.util.Arrays;

public class SortStringMyWay {

    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, (o1, o2) -> {
            char c1 = o1.charAt(n);
            char c2 = o2.charAt(n);

            if (c1 == c2) {
                return o1.compareTo(o2);
            }

            return String.valueOf(c1).compareTo(String.valueOf(c2));
        });

        return strings;
    }
}
