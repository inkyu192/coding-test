package programmers.introduction.level0;

public class GetDivisor {

    public int[] solution(int n) {
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) count++;
        }

        int index = 0;
        int[] answer = new int[count];

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer[index] = i;
                index++;
            }
        }


        return answer;
    }
}
