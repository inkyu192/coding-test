package programmers.practice.level1;

import java.util.Arrays;

public class FindKimSeoBangInSeoul {

    public String solution(String[] seoul) {
        return "김서방은 " + Arrays.asList(seoul).indexOf("Kim") + "에 있다";
    }
}
