package programmers.fullsearch.level2;

public class Fatigue {

    private int answer = 0;
    private boolean[] visit;

    public int solution(int k, int[][] dungeons) {
        visit = new boolean[dungeons.length];

        dfs(k, dungeons, 0);

        return answer;
    }

    private void dfs(int k, int[][] dungeons, int index) {
        for (int i = 0; i < dungeons.length; i++) {
            if (!visit[i] && dungeons[i][0] <= k) {
                visit[i] = true;
                dfs(k - dungeons[i][1], dungeons, index + 1);
                visit[i] = false;
            }
        }

        answer = Math.max(answer, index);
    }
}
