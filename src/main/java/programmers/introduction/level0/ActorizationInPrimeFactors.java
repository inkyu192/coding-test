package programmers.introduction.level0;

import java.util.Set;
import java.util.TreeSet;

public class ActorizationInPrimeFactors {

    public int[] solution(int n) {
        Set<Integer> set = new TreeSet<>();
        int num = 2;

        while (n > 1) {
            if (n % num == 0) {
                set.add(num);
                n /= num;
            } else {
                num++;
            }
        }

        int[] answer = new int[set.size()];
        int index = 0;

        for (Integer integer : set) {
            answer[index] = integer;
            index++;
        }

        return answer;
    }
}
