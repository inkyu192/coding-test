package programmers.level_0.introduction;

public class StringInString {

    public int solution(String str1, String str2) {
        return str1.contains(str2) ? 1 : 2;
    }
}
