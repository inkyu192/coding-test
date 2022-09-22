package programmers.codechallenge.level1;

public class FindANumberWhoseRemainderIs1 {

    public int solution(int n) {
        int answer = 1;

        while (n % answer != 1) answer++;

        return answer;
    }
}
