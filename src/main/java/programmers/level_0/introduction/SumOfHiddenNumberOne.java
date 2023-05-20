package programmers.level_0.introduction;

public class SumOfHiddenNumberOne {

    public int solution(String my_string) {
        int answer = 0;

        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);

            if (Character.isDigit(c)) {
                answer += Integer.parseInt(String.valueOf(c));
            }
        }

        return answer;
    }
}
