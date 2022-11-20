package programmers.practice.level1;

import java.util.ArrayList;
import java.util.List;

public class WeaponOfTemplar {

    public int solution(int number, int limit, int power) {
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= number; i++) {
            int count = 0;

            for (int j = 1; j <= (int) Math.sqrt(i); j++) {
                if (i % j == 0) {
                    count++;
                    if (i / j != j) count++;
                }
            }

            list.add(count);
        }

        int answer = 0;

        for (Integer integer : list) {
            answer += integer > limit ? power : integer;
        }

        return answer;
    }
}
