package programmers.practice.level2;

public class CreatingJadenCaseStrings {

    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        String[] arr = s.toLowerCase().split("");
        boolean flag = true;

        for (String ss : arr) {
            sb.append(flag ? ss.toUpperCase() : ss);
            flag = ss.equals(" ") ? true : false;
        }

        return sb.toString();
    }
}
