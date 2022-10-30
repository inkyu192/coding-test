package programmers.introduction.level0;

public class RockPaperScissors {

    public String solution(String rsp) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < rsp.length(); i++) {
            char c = rsp.charAt(i);

            if (c == '0') {
                sb.append("5");
            } else if (c == '2') {
                sb.append("0");
            } else if (c == '5') {
                sb.append("2");
            }
        }

        return sb.toString();
    }
}
