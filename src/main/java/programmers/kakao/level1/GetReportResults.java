package programmers.kakao.level1;

import java.util.*;

public class GetReportResults {

    public int[] solution(String[] id_list, String[] report, int k) {
        Map<String, Integer> map = new HashMap<>();
        Set<String> set = new HashSet<>();

        for (String str : id_list) {
            map.put(str, 0);
        }

        Collections.addAll(set, report);

        for (String str : set) {
            map.put(str.split(" ")[1], map.get(str.split(" ")[1]) + 1);
        }

        int[] answer = new int[id_list.length];

        for (String str : set) {
            if (map.get(str.split(" ")[1]) >= k) {
                answer[Arrays.asList(id_list).indexOf(str.split(" ")[0])]++;
            }
        }

        return answer;
    }
}
