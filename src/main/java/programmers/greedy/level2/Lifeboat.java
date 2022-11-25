package programmers.greedy.level2;

import java.util.Arrays;

public class Lifeboat {

    public int solution(int[] people, int limit) {
        int answer = 0;

        Arrays.sort(people);

        int left = 0;
        int right = people.length - 1;

        while (left <= right) {
            if (people[left] + people[right] <= limit) {
                answer++;
                left++;
                right--;
            } else {
                answer++;
                right--;
            }
        }

        return answer;
    }
}
