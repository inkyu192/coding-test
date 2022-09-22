package programmers.kakao.level1;

public class NewIDRecommendation {

    public String solution(String new_id) {
        String answer = new_id;

        //step1
        answer = answer.toLowerCase();

        //step2
        answer = answer.replaceAll("[^-_.a-z0-9]", "");

        //step3
        answer = answer.replaceAll("[.]{2,}", ".");

        //step4
        if (answer.startsWith(".")) answer = answer.substring(1);
        if (answer.endsWith(".")) answer = answer.substring(0, answer.length() - 1);

        //step5
        if (answer.isEmpty()) {
            answer = "a";
        }

        //step6
        if (answer.length() >= 16) answer = answer.substring(0, 15);
        if (answer.endsWith(".")) answer = answer.substring(0, answer.length() - 1);

        //step7
        while (answer.length() < 3) {
            answer += answer.substring(answer.length() - 1);
        }

        return answer;
    }
}
