package programmers.level_0.basictraining;

public class FindTheStringYouWant {

    public int solution(String myString, String pat) {
        return myString.toUpperCase().contains(pat.toUpperCase()) ? 1 : 0;
    }
}
