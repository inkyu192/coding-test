package programmers.level_0.basictraining;

public class LastNCharactersOfString {

    public String solution(String my_string, int n) {
        return my_string.substring(my_string.length() - n);
    }
}
