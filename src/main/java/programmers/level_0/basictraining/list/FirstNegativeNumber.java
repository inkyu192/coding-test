package programmers.level_0.basictraining.list;

public class FirstNegativeNumber {

    public int solution(int[] num_list) {
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] < 0) {
                return i;
            }
        }

        return -1;
    }
}
