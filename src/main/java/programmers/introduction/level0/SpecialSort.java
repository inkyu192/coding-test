package programmers.introduction.level0;


import java.util.Arrays;

public class SpecialSort {

    public int[] solution(int[] numlist, int n) {
        Integer[] array = new Integer[numlist.length];

        for (int i = 0; i < numlist.length; i++) {
            array[i] = numlist[i];
        }

        Arrays.sort(array, (o1, o2) -> {
            int abs1 = Math.abs(o1 - n);
            int abs2 = Math.abs(o2 - n);

            if (abs1 == abs2) {
                return Integer.compare(o2, o1);
            } else {
                return Integer.compare(abs1, abs2);
            }
        });

        int[] result = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            result[i] = array[i];
        }

        return result;
    }
}
