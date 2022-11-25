package programmers.practice.level2;

public class MaxAndMinValue {

    public String solution(String s) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        String[] array = s.split(" ");

        for (String str : array) {
            min = Math.min(min, Integer.parseInt(str));
            max = Math.max(max, Integer.parseInt(str));
        }

        return min + " " + max;
    }
}
