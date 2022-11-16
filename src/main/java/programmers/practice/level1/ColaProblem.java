package programmers.practice.level1;

public class ColaProblem {

    public int solution(int a, int b, int n) {
        int answer = 0;

        while (n >= a) {
            answer += n / a * b;
            n = n / a * b + n % a;
        }

        return answer;
    }
}
