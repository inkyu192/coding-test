package programmers.level_0.introduction;

public class MorseCodeOne {

    public String solution(String letter) {
        StringBuilder sb = new StringBuilder();
        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        String[] letterList = letter.split(" ");

        for (int i = 0; i < letterList.length; i++) {
            for (int j = 0; j < morse.length; j++) {
                if (letterList[i].equals(morse[j])) {
                    sb.append((char) (j + 'a'));
                }
            }
        }

        return sb.toString();
    }
}
