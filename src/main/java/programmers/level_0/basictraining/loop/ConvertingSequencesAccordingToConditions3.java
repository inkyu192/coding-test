package programmers.level_0.basictraining.loop;

public class ConvertingSequencesAccordingToConditions3 {

    public int[] solution(int[] arr, int k) {
        int[] answer = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            answer[i] = k % 2 == 0 ? arr[i] + k : arr[i] * k;
        }

        return answer;
    }
}
