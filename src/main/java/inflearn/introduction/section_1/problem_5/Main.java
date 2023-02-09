package inflearn.introduction.section_1.problem_5;

import java.util.Scanner;

/**
 * 5. 특정 문자 뒤집기
 */
public class Main {

    public String solution(String str) {
        char[] chars = str.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            if (!Character.isAlphabetic(chars[left])) left++;
            else if (!Character.isAlphabetic(chars[right])) right--;
            else {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }

        return String.valueOf(chars);
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
