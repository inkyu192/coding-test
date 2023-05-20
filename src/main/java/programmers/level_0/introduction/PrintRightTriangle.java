package programmers.level_0.introduction;

public class PrintRightTriangle {

    public void solution(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("*".repeat(i));
        }
    }
}
