package programmers.codechallenge.level1;

import java.util.Iterator;
import java.util.TreeSet;

public class SumPickTwo {

    public int[] solution(int[] numbers) {
        TreeSet<Integer> set = new TreeSet<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }

        int index = 0;
        int[] answer = new int[set.size()];

        Iterator<Integer> iter = set.iterator();
        while (iter.hasNext()) {
            answer[index] = iter.next();
            index++;
        }

        return answer;
    }
}
