package programmers.practice.level2;

public class NumberOf124Countries {

    public String solution(int n) {
        StringBuilder sb = new StringBuilder();
        String[] numbers = {"4", "1", "2"};

        while (n > 0) {
            int a = n % 3;
            n /= 3;

            if (a == 0) n--;

            sb.insert(0, numbers[a]);
        }

        return sb.toString();
    }
}
