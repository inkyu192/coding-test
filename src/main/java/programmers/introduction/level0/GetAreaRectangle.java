package programmers.introduction.level0;

public class GetAreaRectangle {

    public int solution(int[][] dots) {
        int maxWidth = -256;
        int minWidth = 256;
        int maxHeight = -256;
        int minHeight = 256;

        for (int i = 0; i < dots.length; i++) {
            maxWidth = Math.max(maxWidth, dots[i][0]);
            minWidth = Math.min(minWidth, dots[i][0]);

            maxHeight = Math.max(maxHeight, dots[i][1]);
            minHeight = Math.min(minHeight, dots[i][1]);
        }

        return (maxWidth - minWidth) * (maxHeight - minHeight);
    }
}
