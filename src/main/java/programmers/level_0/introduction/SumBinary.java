package programmers.level_0.introduction;

public class SumBinary {

    public String solution(String bin1, String bin2) {
        int radix = 2;

        return Integer.toString(Integer.valueOf(bin1, radix) + Integer.valueOf(bin2, radix), radix);
    }
}
