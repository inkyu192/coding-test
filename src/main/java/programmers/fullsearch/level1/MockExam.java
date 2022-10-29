package programmers.fullsearch.level1;

import java.util.ArrayList;

public class MockExam {

    public int[] solution(int[] answers) {
        int[] count = {0, 0, 0};
        int[][] array = {
                {1, 2, 3, 4, 5},
                {2, 1, 2, 3, 2, 4, 2, 5},
                {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };

        for (int i = 0; i < answers.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (answers[i] == array[j][i % array[j].length]) count[j]++;
            }
        }

        int max = 0;
        
        for (int i = 0; i < count.length; i++) {
            max = Math.max(max, count[i]);
        }

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < count.length; i++) {
            if (max == count[i]) list.add(i + 1);
        }

        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
