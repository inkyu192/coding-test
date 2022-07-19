package programmers.lv1;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

class RectangularStarOutput {

    @Test
    void solution() {
        int a = 5;
        int b = 3;

        StringBuffer star = new StringBuffer();
        IntStream.range(0, a).forEach(i -> star.append("*"));
        IntStream.range(0, b).forEach(i -> System.out.println(star.toString()));
    }
}
