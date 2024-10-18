package inflearn.introduction.section_1;

import java.util.Scanner;

/**
 * 3. 문장 속 단어
 */
public class WordInSentence {

    public String solution(String str) {
        String answer = "";
        int max = 0;

        for (String s : str.split(" ")) {
            if (s.length() > max) {
                answer = s;
                max = s.length();
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        WordInSentence T = new WordInSentence();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.print(T.solution(str));
    }
}
