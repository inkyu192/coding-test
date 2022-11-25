package programmers.codechallenge.level2;

public class RepeatBinaryConversion {

    public int[] solution(String s) {
        int[] answer = new int[2];

        while (!s.equals("1")) {
            answer[0]++;
            String temp = s.replace("0", "");
            answer[1] += s.length() - temp.length();
            s = Integer.toBinaryString(temp.length());
        }

        return answer;
    }
}
