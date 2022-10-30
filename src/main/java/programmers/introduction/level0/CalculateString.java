package programmers.introduction.level0;

public class CalculateString {

    public int solution(String my_string) {
        int answer = 0;
        boolean sign = true;
        String[] split = my_string.split(" ");

        for (int i = 0; i < split.length; i++) {
            String str = split[i];

            if (i % 2 == 0) {
                answer += sign ? Integer.parseInt(str) : -Integer.parseInt(str);
            } else {
                sign = str.equals("+");
            }
        }

        return answer;
    }
}
