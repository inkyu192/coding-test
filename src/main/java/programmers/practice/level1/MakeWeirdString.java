package programmers.practice.level1;

public class MakeWeirdString {

    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        String[] split = s.split("");
        int index = 0;

        for (String s1 : split) {
            index = s1.equals(" ") ? 0 : index + 1;
            sb.append(index % 2 == 0 ? s1.toLowerCase() : s1.toUpperCase());
        }

        return sb.toString();
    }
}
