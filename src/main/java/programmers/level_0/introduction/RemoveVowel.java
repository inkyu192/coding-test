package programmers.level_0.introduction;

public class RemoveVowel {

    public String solution(String my_string) {
        return my_string.replaceAll("[aeiou]", "");
    }
}
