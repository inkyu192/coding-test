package programmers.introduction.level0;

public class BabblingOne {

    public int solution(String[] babbling) {
        int answer = 0;
        String[] array = {"aya", "ye", "woo", "ma"};

        for (int i = 0; i < babbling.length; i++) {
            String str = babbling[i];

            for (int j = 0; j < array.length; j++) {
                str = str.replaceFirst(array[j], "*");
            }

            str = str.replace("*", "");
            if (str.length() == 0) answer++;
        }

        return answer;
    }
}
