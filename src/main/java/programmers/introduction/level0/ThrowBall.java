package programmers.introduction.level0;

public class ThrowBall {

    public int solution(int[] numbers, int k) {
        int index = (k * 2 - 2) % numbers.length;

        return numbers[index];
    }
}
