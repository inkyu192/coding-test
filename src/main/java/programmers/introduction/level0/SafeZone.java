package programmers.introduction.level0;

public class SafeZone {

    public int solution(int[][] board) {
        int length = board.length;
        int[][] array = new int[length][length];

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (board[i][j] == 1) {
                    array[i][j] = 1;
                    if (i > 0) array[i - 1][j] = 1;
                    if (i < length - 1) array[i + 1][j] = 1;
                    if (j > 0) array[i][j - 1] = 1;
                    if (j < length - 1) array[i][j + 1] = 1;
                    if (i > 0 && j > 0) array[i - 1][j - 1] = 1;
                    if (i > 0 && j < length - 1) array[i - 1][j + 1] = 1;
                    if (i < length - 1 && j > 0) array[i + 1][j - 1] = 1;
                    if (i < length - 1 && j < length - 1) array[i + 1][j + 1] = 1;
                }
            }
        }

        int answer = 0;

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (array[i][j] == 0) answer++;
            }
        }

        return answer;
    }
}
