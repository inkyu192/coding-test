package programmers.introduction.level0;

public class HateEnglish {

    public long solution(String numbers) {
        String[] list = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < list.length; i++) {
            numbers = numbers.replace(list[i], String.valueOf(i));
        }

        return Long.parseLong(numbers);
    }
}
