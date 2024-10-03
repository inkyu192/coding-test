package programmers.level_1.practice;

public class FindAverage {

    public double solution(int[] arr) {
        int sum = 0;

        for (int i : arr) {
            sum += i;
        }

        return (double) sum / arr.length;
    }
}
