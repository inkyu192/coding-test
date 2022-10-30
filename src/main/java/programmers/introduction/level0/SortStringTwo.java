package programmers.introduction.level0;

import java.util.Arrays;

public class SortStringTwo {

    public String solution(String my_string) {
        char[] chars = my_string.toLowerCase().toCharArray();

        Arrays.sort(chars);

        return new String(chars);
    }
}
