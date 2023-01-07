package programmers.practice.level1;

public class SplitString {

    public int solution(String s) {
        int answer = 0;
        char x = 0;
        int count = 0;

        for (char c : s.toCharArray()) {
            if (count == 0) x = c;

            if (x == c) {
                count++;
            } else {
                count--;
            }

            if (count == 0) answer++;
        }

        if (count != 0) answer++;

        return answer;
    }
}
