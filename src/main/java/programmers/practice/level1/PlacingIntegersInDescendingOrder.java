package programmers.practice.level1;

import java.util.Arrays;
import java.util.Comparator;

public class PlacingIntegersInDescendingOrder {

    public long solution(long n) {
        String[] array = String.valueOf(n).split("");
        Arrays.sort(array, Comparator.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for (String s : array) {
            sb.append(s);
        }

        return Long.parseLong(sb.toString());
    }
}
