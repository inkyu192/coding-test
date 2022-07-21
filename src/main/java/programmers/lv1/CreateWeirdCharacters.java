package programmers.lv1;

import java.util.Locale;

public class CreateWeirdCharacters {

    public String solution(String s) {
        String answer = "";
        int index = 1;
        String[] array = s.split("");

        for (String ss : array) {
            index = ss.equals(" ") ? 1 : index + 1;
            answer += index % 2 == 0 ? ss.toUpperCase() : ss.toLowerCase();
        }

        return answer;
    }
}
