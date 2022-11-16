package programmers.kakao.level1;

import java.util.*;

public class FailRate {

    public int[] solution(int N, int[] stages) {
        Map<Integer, Double> map = new HashMap<>();

        for (int i = 1; i <= N; i++) {
            int tryCnt = 0;
            int failCnt = 0;

            for (int stage : stages) {
                if (stage >= i) tryCnt++;
                if (stage == i) failCnt++;
            }

            map.put(i, tryCnt == 0 ? 0.0 : (double) failCnt / tryCnt);
        }

        List<Integer> list = new ArrayList<>(map.keySet());

        list.sort((o1, o2) -> map.get(o2).compareTo(map.get(o1)));

        int[] answer = new int[N];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
