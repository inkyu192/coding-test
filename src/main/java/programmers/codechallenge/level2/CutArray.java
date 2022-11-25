package programmers.codechallenge.level2;

public class CutArray {

    public int[] solution(int n, long left, long right) {
        int index = 0;
        int[] answer = new int[(int) right - (int) left + 1];

        for (long i = left; i < right + 1; i++) {
            long row = i / n;
            long col = i % n;

            answer[index] = Math.max((int) row, (int) col) + 1;
            index++;
        }

        return answer;
    }
}
