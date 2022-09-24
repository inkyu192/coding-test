package programmers.fullsearch.level2;

public class Carpet {

    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int total = brown + yellow;

        for (int i = 3; i < total; i++) {
            int height = i;
            int width = total / height;

            if (width < height) continue;

            if ((width - 2) * (height - 2) == yellow) {
                answer[0] = width;
                answer[1] = height;
                break;
            }
        }

        return answer;
    }
}
