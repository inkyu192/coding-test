package programmers.introduction.level0;

import java.util.Scanner;

public class PrintRightTriangle {

    public void solution(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("*".repeat(i));
        }
    }
}
