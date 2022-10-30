package programmers.introduction.level0;

public class MakeBFromA {

    public int solution(String before, String after) {
        int answer = 1;

        String[] split = before.split("");

        for (String s : split) {
            if (!after.contains(s)) {
                answer = 0;
                break;
            } else {
                after = after.replaceFirst(s, "");
            }
        }

        return answer;
    }
}
