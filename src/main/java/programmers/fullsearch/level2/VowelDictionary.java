package programmers.fullsearch.level2;

public class VowelDictionary {

    public int solution(String word) {
        int answer = 0;
        String str = "AEIOU";
        int[] x = {781, 156, 31, 6, 1};

        for (int i = 0; i < word.length(); i++) {
            int index = str.indexOf(word.charAt(i));
            answer += x[i] * index + 1;
        }

        return answer;
    }
}
