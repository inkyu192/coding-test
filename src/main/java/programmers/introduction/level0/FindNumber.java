package programmers.introduction.level0;

public class FindNumber {

    public int solution(int num, int k) {
        int answer = String.valueOf(num).indexOf(String.valueOf(k));

        if (answer > 0 ) answer++;

        return answer;
    }
}
