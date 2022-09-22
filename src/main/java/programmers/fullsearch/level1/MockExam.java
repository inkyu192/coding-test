package programmers.fullsearch.level1;

import java.util.ArrayList;
import java.util.List;

public class MockExam {

    public int[] solution(int[] answers) {
        int[] person1 = {1, 2, 3, 4, 5};
        int[] person2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] person3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] scoreArray = new int[3];

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == person1[i % person1.length]) scoreArray[0]++;
            if (answers[i] == person2[i % person2.length]) scoreArray[1]++;
            if (answers[i] == person3[i % person3.length]) scoreArray[2]++;
        }

        int maxScore = 0;
        for (int score : scoreArray) {
            maxScore = Math.max(maxScore, score);
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < scoreArray.length; i++) {
            if (maxScore == scoreArray[i]) list.add(i + 1);
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
