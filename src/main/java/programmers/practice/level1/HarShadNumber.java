package programmers.practice.level1;

public class HarShadNumber {

    public boolean solution(int x) {
        String[] array = String.valueOf(x).split("");
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += Integer.parseInt(array[i]);
        }

        return x % sum == 0 ? true : false;
    }
}