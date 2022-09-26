package programmers.codechallenge.level1;

public class TernaryReverse {

    public int solution(int n) {
        String s1 = Integer.toString(n, 3);
        String s2 = new StringBuilder(s1).reverse().toString();

        return Integer.parseInt(s2, 3);
    }
}
