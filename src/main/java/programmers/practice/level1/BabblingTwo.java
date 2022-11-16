package programmers.practice.level1;

public class BabblingTwo {

    public int solution(String[] babbling) {
        int answer = 0;
        String[] possible = {"aya", "ye", "woo", "ma"};
        String[] impossible = {"ayaaya", "yeye", "woowoo", "mama"};

        for (String str : babbling) {
            boolean flag = true;

            for (String value : impossible) {
                if (str.contains(value)) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                for (String value : possible) {
                    str = str.replace(value, "*");
                }

                str = str.replace("*", "");

                if (str.isEmpty()) {
                    answer++;
                }
            }
        }

        return answer;
    }
}
