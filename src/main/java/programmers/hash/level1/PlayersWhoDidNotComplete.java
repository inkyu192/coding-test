package programmers.hash.level1;

import java.util.HashMap;

public class PlayersWhoDidNotComplete {

    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap<>();

        for (String name : participant) map.put(name, map.getOrDefault(name, 0) + 1);
        for (String name : completion) map.put(name, map.get(name) - 1);

        String answer = "";
        for (String key : map.keySet()) {
            if (map.get(key) != 0) answer = key;
        }

        return answer;
    }
}
