package programmers.level_0.basictraining.print;

import java.util.Scanner;

public class TurnTheString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        for (char c : a.toCharArray()) {
            System.out.println(c);
        }
    }
}
