package programmers.kakao.level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FailureRate {

    public int[] solution(int N, int[] stages) {
        int[] nStagePlayers = new int[N + 2];
        for (int stage : stages) {
            nStagePlayers[stage] += 1;
        }

        int playerCnt = stages.length;
        List<Stage> list = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            double failureRate = (double) nStagePlayers[i] / playerCnt;
            playerCnt -= nStagePlayers[i];
            list.add(new Stage(i, failureRate));
        }

        Collections.sort(list, Collections.reverseOrder());

        int[] answer = new int[N];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i).number;
        }

        return answer;
    }

    class Stage implements Comparable<Stage> {
        int number;
        double failureRate;

        public Stage(int number, double failureRate) {
            this.number = number;
            this.failureRate = failureRate;
        }

        @Override
        public int compareTo(Stage o) {
            return failureRate > o.failureRate ? 1 : failureRate < o.failureRate ? -1 : 0;
        }
    }
}
