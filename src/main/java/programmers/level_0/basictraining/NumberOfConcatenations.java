package programmers.level_0.basictraining;

public class NumberOfConcatenations {

    public int solution(int[] num_list) {
        int odd = 0;
        int even = 0;

        for (int i : num_list) {
            if (i % 2 == 0) {
                even *= 10;
                even += i;
            } else {
                odd *= 10;
                odd += i;
            }
        }

        return odd + even;
    }
}
