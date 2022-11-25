package programmers.practice.level2;

public class NextBigNumber {

    public int solution(int n) {
        int answer = n + 1;
        int originalCount = Integer.bitCount(n);

        while (true) {
            int compareCount = Integer.bitCount(answer);

            if (originalCount == compareCount) {
                break;
            } else {
                answer++;
            }
        }

        return answer;
    }
}
