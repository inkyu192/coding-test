package programmers.introduction.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetDivisor {

    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0) {
                list.add(i);
                if (n / i != i) list.add(n / i);
            }
        }

        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        Arrays.sort(answer);

        return answer;
    }
}
