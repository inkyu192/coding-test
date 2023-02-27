package inflearn.introduction.section_7.problem_2;

/**
 * 2. 이진수 출력(재귀)
 */
public class Main {

    public void DFS(int n) {
        if (n == 0) {
            return;
        } else {
            DFS(n / 2);
            System.out.print(n % 2 + " ");
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        T.DFS(11);
    }
}
