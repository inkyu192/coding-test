package programmers.level_0.introduction;

public class AgeOfExoplanet {

    public String solution(int age) {
        StringBuilder sb = new StringBuilder();
        String[] ageList = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};

        while (age > 0) {
            int remainder = age % 10;

            sb.append(ageList[remainder]);

            age /= 10;
        }

        return sb.reverse().toString();
    }
}
