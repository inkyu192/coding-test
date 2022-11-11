package programmers.introduction.level0;

public class NextNumber {

    public int solution(int[] common) {
        int answer;

        if (common[2] - common[1] == common[1] - common[0]) {
            answer = common[common.length - 1] + common[1] - common[0];
        } else {
            answer = common[common.length - 1] * (common[1] / common[0]);
        }

        return answer;
    }
}
