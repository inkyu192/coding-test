package programmers.stackqueue.level1;

import java.util.ArrayList;

public class IHateTheSameNumber {

    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();

        int preNum = -1;
        for (int num : arr) {
            if (preNum != num) {
                list.add(num);
            }
            preNum = num;
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i).intValue();
        }

        return answer;
    }
}
