package programmers.level_0.basictraining.string;

public class FindByReplacingTheString {

    public int solution(String myString, String pat) {
        return myString.toLowerCase()
                .replace("a", "B")
                .replace("b", "A")
                .contains(pat) ? 1 : 0;
    }
}
