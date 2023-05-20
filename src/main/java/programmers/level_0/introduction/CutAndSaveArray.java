package programmers.level_0.introduction;

public class CutAndSaveArray {

    public String[] solution(String my_str, int n) {
        String[] answer;

        if (my_str.length() % n == 0) {
            answer = new String[my_str.length() / n];
        } else {
            answer = new String[my_str.length() / n + 1];
        }

        int beginIndex = 0;
        int endIndex = n;

        for (int i = 0; i < answer.length; i++) {
            answer[i] = my_str.substring(beginIndex, endIndex);

            beginIndex += n;
            endIndex += n;

            if (endIndex >= my_str.length()) endIndex = my_str.length();
        }

        return answer;
    }
}
