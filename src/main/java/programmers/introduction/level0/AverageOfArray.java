package programmers.introduction.level0;

public class AverageOfArray {

    public double solution(int[] numbers) {
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        return (double) sum / numbers.length;
    }
}
