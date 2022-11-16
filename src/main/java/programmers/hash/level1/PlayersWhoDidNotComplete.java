package programmers.hash.level1;

import java.util.HashMap;
import java.util.Map;

public class PlayersWhoDidNotComplete {

    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();

        for (String s : completion) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        for (String s : participant) {
            map.put(s, map.getOrDefault(s, 0) - 1);
        }

        String answer = "";

        for (String key : map.keySet()) {
            if (map.get(key) == -1) answer = key;
        }

        return answer;
    }
}
