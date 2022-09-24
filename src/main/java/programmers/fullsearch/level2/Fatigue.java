package programmers.fullsearch.level2;

public class Fatigue {

    int answer;
    boolean[] visit;

    public int solution(int k, int[][] dungeons) {
        visit = new boolean[dungeons.length];

        recursion(k, dungeons, 0);

        return answer;
    }

    private void recursion(int k, int[][] dungeons, int count) {
        for (int i = 0; i < dungeons.length; i++) {
            if (!visit[i] && k >= dungeons[i][0]) {
                visit[i] = true;
                recursion(k - dungeons[i][1], dungeons, count + 1);
                visit[i] = false;
            }
        }
        answer = Math.max(answer, count);
    }
}
