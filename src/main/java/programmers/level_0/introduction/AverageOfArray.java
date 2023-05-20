package programmers.level_0.introduction;

public class AverageOfArray {

    public double solution(int[] numbers) {
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        return (double) sum / numbers.length;
    }
}
