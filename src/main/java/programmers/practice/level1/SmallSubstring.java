package programmers.practice.level1;

public class SmallSubstring {

    public int solution(String t, String p) {
        int answer = 0;

        for (int i = 0; i <= t.length() - p.length(); i++) {
            long num1 = Long.parseLong(t.substring(i, i + p.length()));
            long num2 = Long.parseLong(p);

            if (num1 <= num2) answer++;
        }

        return answer;
    }
}
