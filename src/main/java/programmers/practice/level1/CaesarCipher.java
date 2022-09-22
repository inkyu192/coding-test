package programmers.practice.level1;

public class CaesarCipher {

    public String solution(String s, int n) {
        String answer = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isUpperCase(c)) {
                c = c + n > 'Z' ? (char) (c + n - 26) : (char) (c + n);
            } else if (Character.isLowerCase(c)) {
                c = c + n > 'z' ? (char) (c + n - 26) : (char) (c + n);
            }
            answer += c;
        }

        return answer;
    }
}
