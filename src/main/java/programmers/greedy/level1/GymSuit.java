package programmers.greedy.level1;

public class GymSuit {

    public int solution(int n, int[] lost, int[] reserve) {
        int[] array = new int[n];

        for (int i : lost) array[i - 1]--;
        for (int i : reserve) array[i - 1]++;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == -1) {
                if (i != 0 && array[i - 1] == 1) {
                    array[i - 1]--;
                    array[i]++;
                } else if (i != array.length - 1 && array[i + 1] == 1) {
                    array[i + 1]--;
                    array[i]++;
                }
            }
        }

        int answer = 0;

        for (int i : array) {
            if (i >= 0) answer++;
        }

        return answer;
    }
}
