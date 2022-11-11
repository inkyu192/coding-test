package programmers.introduction.level0;

import java.util.*;

public class StringOnlyOne {

    public String solution(String s) {
        String[] split = s.split("");
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < split.length; i++) {
            String str = split[i];
            map.put(str, map.getOrDefault(str, 0) + 1);
        }

        List<String> list = new ArrayList<>();

        for (String key : map.keySet()) {
            if (map.get(key) == 1) list.add(key);
        }

        Collections.sort(list);

        StringBuilder sb = new StringBuilder();

        for (String s1 : list) {
            sb.append(s1);
        }

        return sb.toString();
    }
}
