package programmers.practice.level1;

public class StringHandlingBasic {

    public boolean solution(String s) {
        if (s.length() == 4 || s.length() == 6) {
            try {
                Integer.parseInt(s);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        }
        return false;
    }
}
