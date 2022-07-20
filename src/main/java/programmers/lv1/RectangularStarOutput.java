package programmers.lv1;

import java.util.stream.IntStream;

public class RectangularStarOutput {

    public void solution(int a, int b) {
        StringBuffer star = new StringBuffer();
        IntStream.range(0, a).forEach(i -> star.append("*"));
        IntStream.range(0, b).forEach(i -> System.out.println(star.toString()));
    }
}
