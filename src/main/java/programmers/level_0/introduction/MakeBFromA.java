package programmers.level_0.introduction;

public class MakeBFromA {

    public int solution(String before, String after) {
        int answer = 1;
        String[] split = before.split("");

        for (int i = 0; i < split.length; i++) {
            String s = split[i];

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
