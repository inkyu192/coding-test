package programmers.level_0.basictraining;

public class ToUpperCaseSpecificLetters {

    public String solution(String my_string, String alp) {
        return my_string.replace(alp, alp.toUpperCase());
    }
}
