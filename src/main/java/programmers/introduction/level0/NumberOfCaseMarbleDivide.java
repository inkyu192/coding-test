package programmers.introduction.level0;

import java.math.BigInteger;

public class NumberOfCaseMarbleDivide {

    public int solution(int balls, int share) {
        return factorial(balls).divide(factorial(balls - share).multiply(factorial(share))).intValue();
    }

    private BigInteger factorial(int num) {
        BigInteger result = BigInteger.ONE;
        BigInteger from = BigInteger.ONE;
        BigInteger to = new BigInteger(String.valueOf(num));

        for (BigInteger i = from; i.compareTo(to) <= 0; i = i.add(BigInteger.ONE)) {
            result = result.multiply(i);
        }

        return result;
    }
}
