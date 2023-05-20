package programmers.level_0.introduction;

public class FlipString {

    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder(my_string);

        return sb.reverse().toString();
    }
}
