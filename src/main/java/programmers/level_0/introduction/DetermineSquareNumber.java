package programmers.level_0.introduction;

public class DetermineSquareNumber {

    public int solution(int n) {
        int answer = 2;
        int sqrt = (int) Math.sqrt(n);
        int pow = (int) Math.pow(sqrt, 2);

        if (pow == n) answer = 1;

        return answer;
    }
}
