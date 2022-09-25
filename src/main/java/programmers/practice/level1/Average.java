package programmers.practice.level1;

public class Average {

    public double solution(int[] arr) {
        int answer = 0;

        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }

        return (double) answer / arr.length;
    }
}
