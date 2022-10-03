package programmers.practice.level1;

public class HideCellPhoneNumber {

    public String solution(String phone_number) {
        char[] chars = phone_number.toCharArray();

        for (int i = 0; i < chars.length - 4; i++) {
            chars[i] = '*';
        }

        return String.valueOf(chars);
    }
}
