package programmers.kakao.level1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class GetReportResults {

    public int[] solution(String[] id_list, String[] report, int k) {
        List<String> list = Arrays.stream(report)
                .distinct()
                .collect(Collectors.toList());
        HashMap<String, Integer> map = new HashMap<>();

        for (String s : list) {
            String target = s.split(" ")[1];
            map.put(target, map.getOrDefault(target, 0) + 1);
        }

        int[] answer = Arrays.stream(id_list)
                .map(id -> {
                    List<String> reportList = list.stream()
                            .filter(s -> s.startsWith(id + " "))
                            .collect(Collectors.toList());

                    long count = reportList.stream()
                            .filter(s -> map.getOrDefault(s.split(" ")[1], 0) >= k)
                            .count();

                    return count;
                })
                .mapToInt(Long::intValue)
                .toArray();

        return answer;
    }
}
