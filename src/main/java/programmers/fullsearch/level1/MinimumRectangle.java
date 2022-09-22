package programmers.fullsearch.level1;

public class MinimumRectangle {

    public int solution(int[][] sizes) {
        int maxSide = 0;
        int minSide = 0;

        for (int[] size : sizes) {
            int max = Math.max(size[0], size[1]);
            int min = Math.min(size[0], size[1]);

            maxSide = Math.max(maxSide, max);
            minSide = Math.max(minSide, min);
        }

        return maxSide * minSide;
    }
}
