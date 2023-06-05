package programmers.level_0.basictraining.print;

import java.util.Scanner;

public class ChangeUppercaseAndLowercaseLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        StringBuilder answer = new StringBuilder();
        for (char c : a.toCharArray()) {
            answer.append(Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.toUpperCase(c));
        }
        System.out.println(answer);
    }
}
