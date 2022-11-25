package programmers.stackqueue.level2;

public class FunctionDevelopment {

    public int[] solution(int[] progresses, int[] speeds) {
        int[] array = new int[100];
        int day = 0;

        for (int i = 0; i < progresses.length; i++) {
            while (progresses[i] + (speeds[i] * day) < 100) {
                day++;
            }
            array[day]++;
        }

        int count = 0;

        for (int i : array) {
            if (i != 0) count ++;
        }

        int[] answer = new int[count];
        int index = 0;

        for (int i : array) {
            if (i != 0) {
                answer[index] = i;
                index++;
            }
        }

        return answer;
    }
}
