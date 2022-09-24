package programmers.fullsearch.level2;

import java.util.HashSet;

public class FindPrimeNumber {

    HashSet<Integer> set = new HashSet<>();

    public int solution(String numbers) {
        int answer = 0;

        recursion("", numbers);

        for (Integer integer : set) {
            if (isPrimeNumber(integer)) answer++;
        }

        return answer;
    }

    private void recursion(String number, String remainder) {
        int length = remainder.length();

        if (!number.equals("")) {
            set.add(Integer.valueOf(number));
        }

        for (int i = 0; i < length; i++) {
            recursion(number + remainder.charAt(i), remainder.substring(0, i) + remainder.substring(i + 1, length));
        }
    }

    private Boolean isPrimeNumber(int num) {
        if (num == 0 || num == 1) return false;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }

        return true;
    }
}
