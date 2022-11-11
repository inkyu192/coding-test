package programmers.introduction.level0;

import java.math.BigInteger;

public class NumberOfCaseMarbleDivide {

    public int solution(int balls, int share) {
        return factorial(balls).divide(factorial(balls - share).multiply(factorial(share))).intValue();
    }

    private BigInteger factorial(int num) {
        BigInteger bi = BigInteger.ONE;

        for (int i = 1; i <= num; i++) {
            bi = bi.multiply(new BigInteger(String.valueOf(i)));
        }

        return bi;
    }
}
