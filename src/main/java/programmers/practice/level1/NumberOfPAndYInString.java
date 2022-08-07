package programmers.practice.level1;

public class NumberOfPAndYInString {

    public boolean solution(String s) {
        s = s.toUpperCase();

        long p = s.chars().filter(e -> e == 'P').count();
        long y = s.chars().filter(e -> e == 'Y').count();

        return p == y;
    }
}
