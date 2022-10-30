package programmers.introduction.level0;


import java.util.Arrays;

public class SpecialSort {

    public int[] solution(int[] numlist, int n) {
        Integer[] array = new Integer[numlist.length];

        for (int i = 0; i < numlist.length; i++) {
            array[i] = numlist[i];
        }

        Arrays.sort(array, (o1, o2) -> {
            int abs1 = Math.abs(n - o1);
            int abs2 = Math.abs(n - o2);

            if (abs1 == abs2) {
                return o2 - o1;
            }

            return abs1 - abs2;
        });

        int[] answer = new int[numlist.length];

        for (int i = 0; i < array.length; i++) {
            answer[i] = array[i];
        }

        return answer;
    }
}
