package programmers.kakao.level1;

import java.util.HashMap;
import java.util.Map;

public class PersonalityTypeCheck {

    public String solution(String[] survey, int[] choices) {
        char[][] type = {{'R', 'T'}, {'C', 'F'}, {'J', 'M'}, {'A', 'N'}};
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < type.length; i++) {
            for (int j = 0; j < type[i].length; j++) {
                map.put(type[i][j], 0);
            }
        }

        for (int i = 0; i < survey.length; i++) {
            if (choices[i] < 4) {
                map.put(survey[i].charAt(0), map.get(survey[i].charAt(0)) + 4 - choices[i]);
            } else if (choices[i] > 4) {
                map.put(survey[i].charAt(1), map.get(survey[i].charAt(1)) + choices[i] - 4);
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < type.length; i++) {
            if (map.get(type[i][0]) >= map.get(type[i][1])) {
                sb.append(type[i][0]);
            } else {
                sb.append(type[i][1]);
            }
        }

        return sb.toString();
    }
}
