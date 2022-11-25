package programmers.kakao.level2;

import java.util.LinkedList;

public class FirstCache {

    public int solution(int cacheSize, String[] cities) {
        if (cacheSize == 0) return cities.length * 5;

        int answer = 0;
        LinkedList<String> list = new LinkedList<>();

        for (String city : cities) {
            String s = city.toUpperCase();

            if (list.contains(s)) {
                list.remove(s);
                list.add(s);
                answer += 1;
            } else {
                if (list.size() >= cacheSize) list.remove(0);
                list.add(s);
                answer += 5;
            }
        }

        return answer;
    }
}
