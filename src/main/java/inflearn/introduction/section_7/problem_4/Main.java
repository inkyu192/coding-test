package inflearn.introduction.section_7.problem_4;

/**
 * 4. 피보나치 재귀(메모이제이션)
 */
public class Main {

    static int[] fibo;

    public int DFS(int n) {
        if (fibo[n] > 0) return fibo[n];

        if (n == 1 || n == 2) {
            fibo[n] = 1;
        } else {
            fibo[n] = DFS(n - 2) + DFS(n - 1);
        }

        return fibo[n];
    }

    public static void main(String[] args) {
        Main T = new Main();
        int n = 45;
        fibo = new int[n + 1];
        T.DFS(n);
        for (int i = 0; i <= n; i++) {
            System.out.print(fibo[i] + " ");
        }
    }
}
