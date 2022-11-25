package programmers.practice.level2;

public class MakeJadenCaseString {

    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        boolean flag = true;
        String[] split = s.split("");

        for (String str : split) {
            sb.append(flag ? str.toUpperCase() : str.toLowerCase());
            flag = str.equals(" ");
        }

        return sb.toString();
    }
}
