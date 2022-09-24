package programmers.sort.level2;

import java.util.ArrayList;
import java.util.Collections;

public class BiggestNumber {

    public String solution(int[] numbers) {
        ArrayList<String> list = new ArrayList<>();

        for (int number : numbers) {
            list.add(String.valueOf(number));
        }

        Collections.sort(list, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));

        if (list.get(0).equals("0")) return "0";

        StringBuilder answer = new StringBuilder();

        for (String s : list) {
            answer.append(s);
        }

        return answer.toString();
    }
}
