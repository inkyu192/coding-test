package programmers.introduction.level0;

import java.util.Arrays;

public class SetTreatmentOrder {

    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] list = Arrays.copyOf(emergency, emergency.length);

        Arrays.sort(list);

        for (int i = 0; i < emergency.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if (emergency[i] == list[j]) answer[i] = emergency.length - j;
            }
        }

        return answer;
    }
}
