package programmers.practice.level1;

public class CaesarCipher {

    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isUpperCase(ch)) {
                ch = ch + n > 'Z' ? (char) (ch + n - 26) : (char) (ch + n);
            } else if (Character.isLowerCase(ch)) {
                ch = ch + n > 'z' ? (char) (ch + n - 26) : (char) (ch + n);
            }

            sb.append(ch);
        }

        return sb.toString();
    }
}
