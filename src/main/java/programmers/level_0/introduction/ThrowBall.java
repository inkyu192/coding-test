package programmers.level_0.introduction;

public class ThrowBall {

    public int solution(int[] numbers, int k) {
        int index = (k * 2 - 2) % numbers.length;

        return numbers[index];
    }
}
