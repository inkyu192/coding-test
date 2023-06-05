package programmers.level_0.introduction;

import java.util.ArrayList;

public class ChooseMultipleOfN {

    public int[] solution(int n, int[] numlist) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i : numlist) {
            if (i % n == 0) list.add(i);
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
