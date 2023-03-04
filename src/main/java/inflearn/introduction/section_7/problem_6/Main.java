package inflearn.introduction.section_7.problem_6;

/**
 * 6. 부분집합 구하기(DFS)
 */
public class Main {

    static int n;
    static int[] ch;

    public void DFS(int level) {
        if (level == n + 1) {
            for (int i = 0; i < ch.length; i++) {
                if (ch[i] != 0) System.out.print(i + " ");
            }
            System.out.println();
        } else {
            ch[level] = 1;
            DFS(level + 1);
            ch[level] = 0;
            DFS(level + 1);
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        n = 3;
        ch = new int[n + 1];
        T.DFS(1);
    }
}
