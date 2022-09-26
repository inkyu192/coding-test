package programmers.practice.level1;

public class PrintRectangleStar {

    public void solution(int a, int b) {

        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
