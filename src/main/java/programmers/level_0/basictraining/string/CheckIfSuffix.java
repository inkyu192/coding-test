package programmers.level_0.basictraining.string;

public class CheckIfSuffix {

    public int solution(String my_string, String is_suffix) {
        return my_string.endsWith(is_suffix) ? 1 : 0;
    }
}
