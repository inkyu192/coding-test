package programmers.practice.level2;

public class NQueen {

    int answer;
    int[] col;

    public int solution(int n) {
        for (int i = 0; i < n; i++) {
            col = new int[n];
            col[0] = i;
            backtracking(n, 1);
        }

        return answer;
    }

    private void backtracking(int max, int row) {

    }
}
