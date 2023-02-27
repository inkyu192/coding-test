package inflearn.introduction.section_7.problem_1;

/**
 * 1. 재귀함수(스택프레임)
 */
public class Main {

    public void DFS(int n) {
        if (n == 0) {
            return;
        } else {
            DFS(n - 1);
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        T.DFS(3);
    }
}
