package programmers.introduction.level0;

import java.util.TreeSet;

public class ActorizationInPrimeFactors {

    public int[] solution(int n) {
        TreeSet<Integer> set = new TreeSet<>();
        int num = 2;

        while (n > 1) {
            if (n % num == 0) {
                set.add(num);
                n /= num;
            } else {
                num++;
            }
        }

        int index = 0;
        int[] answer = new int[set.size()];

        for (Integer integer : set) {
            answer[index] = integer;
            index++;
        }

        return answer;
    }
}
