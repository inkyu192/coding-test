package programmers.introduction.level0;

public class NearNumber {

    public int solution(int[] array, int n) {
        int abs = 101;
        int num = 101;

        for (int i = 0; i < array.length; i++) {
            int diff = array[i] - n;

            if (Math.abs(diff) < abs) {
                abs = Math.abs(diff);
                num = diff;
            } else if (Math.abs(diff) == abs) {
                num = Math.min(num, diff);
            }
        }

        return n + num;
    }
}
