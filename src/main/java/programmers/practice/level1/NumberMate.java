package programmers.practice.level1;

public class NumberMate {

    public String solution(String X, String Y) {
        StringBuilder sb = new StringBuilder();
        int[] xArray = new int[10];
        int[] yArray = new int[10];

        for (String s : X.split("")) xArray[Integer.parseInt(s)]++;
        for (String s : Y.split("")) yArray[Integer.parseInt(s)]++;

        for (int i = 9; i >= 0; i--) {
            if (xArray[i] > 0 && yArray[i] > 0) {
                sb.append(String.valueOf(i).repeat(Math.min(xArray[i], yArray[i])));
            }
        }

        String answer = sb.toString();

        if (answer.isEmpty()) {
            return "-1";
        } else if (answer.startsWith("0")) {
            return "0";
        } else {
            return answer;
        }
    }
}
