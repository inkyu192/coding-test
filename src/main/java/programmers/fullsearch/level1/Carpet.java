package programmers.fullsearch.level1;

public class Carpet {

    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int total = brown + yellow;

        for (int i = 1; i <= total; i++) {
            int row = i;
            int col = total / row;

            if (total % row == 0 && row >= col) {
                if ((row - 2) * (col - 2) == yellow) {
                    answer[0] = row;
                    answer[1] = col;
                    break;
                }
            }
        }

        return answer;
    }
}
