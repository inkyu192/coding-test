package programmers.level_1.challenge;

public class FindNumberWithRemainderOne {

    public int solution(int n) {
        int result = 1;

        while (n % result != 1) {
            result++;
        }

        return result;
    }
}
