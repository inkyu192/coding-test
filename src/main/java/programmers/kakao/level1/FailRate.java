package programmers.kakao.level1;

import java.util.*;

public class FailRate {

    public int[] solution(int N, int[] stages) {
        HashMap<Integer, Double> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            int stage = i + 1;
            double unClear = 0;
            double clear = 0;

            for (int j = 0; j < stages.length; j++) {
                if (stages[j] == stage) unClear++;
                if (stages[j] >= stage) clear++;
            }

            if (clear != 0) {
                map.put(stage, unClear / clear);
            } else {
                map.put(stage, 0.0);
            }
        }

        ArrayList<Object> list = new ArrayList<>();

        list.addAll(map.keySet());

        Collections.sort(list, (o1, o2) -> {
            Double d1 = map.get(o1);
            Double d2 = map.get(o2);
            return d2.compareTo(d1);
        });

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = (int) list.get(i);
        }

        return answer;
    }
}