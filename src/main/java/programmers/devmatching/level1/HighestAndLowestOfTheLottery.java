package programmers.devmatching.level1;

public class HighestAndLowestOfTheLottery {

    public int[] solution(int[] lottos, int[] win_nums) {
        int winCnt = 0;
        int zeroCnt = 0;

        for (int i = 0; i < lottos.length; i++) {
            if (lottos[i] == 0) zeroCnt++;

            for (int j = 0; j < win_nums.length; j++) {
                if (lottos[i] == win_nums[j]) winCnt++;
            }

        }

        return new int[]{getRanking(winCnt + zeroCnt), getRanking(winCnt)};
    }

    private int getRanking(int cnt) {
        if (cnt == 6) {
            return 1;
        } else if (cnt == 5) {
            return 2;
        } else if (cnt == 4) {
            return 3;
        } else if (cnt == 3) {
            return 4;
        } else if (cnt == 2) {
            return 5;
        } else {
            return 6;
        }
    }
}
