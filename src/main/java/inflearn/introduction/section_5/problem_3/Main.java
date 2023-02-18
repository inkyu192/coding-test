package inflearn.introduction.section_5.problem_3;

import java.util.Scanner;
import java.util.Stack;

/**
 * 3. 크레인 인형뽑기(카카오)
 */
public class Main {

    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (int pos : moves) {
            for (int j = 0; j < board.length; j++) {
                if (board[j][pos - 1] != 0) {
                    int temp = board[j][pos - 1];

                    board[j][pos - 1] = 0;

                    if (!stack.isEmpty() && stack.peek() == temp) {
                        stack.pop();
                        answer += 2;
                    } else {
                        stack.push(temp);
                    }

                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = kb.nextInt();
            }
        }
        int m = kb.nextInt();
        int[] moves = new int[m];
        for (int i = 0; i < m; i++) moves[i] = kb.nextInt();
        System.out.println(T.solution(board, moves));
    }
}
