package programmers.level_0.basictraining.calculation;

public class OverwriteString {

    public String solution(String my_string, String overwrite_string, int s) {
        return my_string.substring(0, s) + overwrite_string + my_string.substring(s + overwrite_string.length());
    }
}
