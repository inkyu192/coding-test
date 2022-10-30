package programmers.introduction.level0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class StringOnlyOne {

    public String solution(String s) {
        String[] split = s.split("");
        HashMap<String, Integer> map = new HashMap<>();

        for (String s1 : split) {
            map.putIfAbsent(s1, 0);
            map.put(s1, map.get(s1) + 1);
        }

        ArrayList<String> list = new ArrayList<>();

        map.forEach((key, value) -> {
            if (value == 1) list.add(key);
        });

        Collections.sort(list);

        StringBuilder sb = new StringBuilder();

        for (String s1 : list) {
            sb.append(s1);
        }

        return sb.toString();
    }
}
