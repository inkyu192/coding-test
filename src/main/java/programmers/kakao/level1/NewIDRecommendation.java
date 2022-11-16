package programmers.kakao.level1;

public class NewIDRecommendation {

    public String solution(String new_id) {
        // step1
        new_id = new_id.toLowerCase();

        // step2
        new_id = new_id.replaceAll("[^a-z0-9-_.]", "");

        // step3
        new_id = new_id.replaceAll("[.]{2,}", ".");

        // step4
        if (new_id.startsWith(".")) new_id = new_id.substring(1);
        if (new_id.endsWith(".")) new_id = new_id.substring(0, new_id.length() - 1);

        // step5
        if (new_id.isEmpty()) new_id = "a";

        // step6
        if (new_id.length() >= 16) new_id = new_id.substring(0, 15);
        if (new_id.endsWith(".")) new_id = new_id.substring(0, new_id.length() - 1);

        // step7
        if (new_id.length() <= 2) {
            while (new_id.length() < 3) {
                new_id += new_id.substring(new_id.length() - 1);
            }
        }

        return new_id;
    }
}
