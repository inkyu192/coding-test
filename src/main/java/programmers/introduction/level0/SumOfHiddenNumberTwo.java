package programmers.introduction.level0;

public class SumOfHiddenNumberTwo {

    public int solution(String my_string) {
        int answer = 0;

        String[] split = my_string
                .replaceAll("[^0-9]", " ")
                .split(" ");

        for (String s : split) {
            if (!s.equals("")) answer += Integer.parseInt(s);
        }

        return answer;
    }
}
