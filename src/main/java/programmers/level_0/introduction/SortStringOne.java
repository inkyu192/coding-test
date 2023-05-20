package programmers.level_0.introduction;

import java.util.ArrayList;
import java.util.Collections;

public class SortStringOne {

    public int[] solution(String my_string) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);

            if (Character.isDigit(c)) {
                list.add(Integer.parseInt(String.valueOf(c)));
            }
        }

        Collections.sort(list);

        int[] answer = new int[list.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
