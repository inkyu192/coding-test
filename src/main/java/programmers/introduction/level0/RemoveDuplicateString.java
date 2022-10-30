package programmers.introduction.level0;

import java.util.ArrayList;

public class RemoveDuplicateString {

    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        String[] split = my_string.split("");

        for (int i = 0; i < split.length; i++) {
            String s = split[i];

            if (sb.indexOf(s) < 0) sb.append(s);
        }

        return sb.toString();
    }
}
