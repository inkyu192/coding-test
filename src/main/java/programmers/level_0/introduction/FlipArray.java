package programmers.level_0.introduction;

public class FlipArray {

    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];

        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[num_list.length - i - 1];
        }

        return answer;
    }
}
