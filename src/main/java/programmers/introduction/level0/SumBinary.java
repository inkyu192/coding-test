package programmers.introduction.level0;

public class SumBinary {

    public String solution(String bin1, String bin2) {
        return Integer.toString(Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2), 2);
    }
}
