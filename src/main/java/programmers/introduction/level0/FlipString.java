package programmers.introduction.level0;

public class FlipString {

    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder(my_string);

        return sb.reverse().toString();
    }
}
