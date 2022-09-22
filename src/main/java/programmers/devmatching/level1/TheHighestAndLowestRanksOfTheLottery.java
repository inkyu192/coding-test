package programmers.devmatching.level1;

public class TheHighestAndLowestRanksOfTheLottery {

    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int maxCount = 0;
        int minCount = 0;

        for (int i = 0; i < lottos.length; i++) {
            for (int j = 0; j < win_nums.length; j++) {
                if (lottos[i] == win_nums[j]) {
                    maxCount++;
                    minCount++;
                }
            }
            if (lottos[i] == 0) maxCount++;
        }

        answer[0] = getRank(maxCount);
        answer[1] = getRank(minCount);

        return answer;
    }

    private int getRank(int count) {
        switch (count) {
            case 6:
                return 1;
            case 5:
                return 2;
            case 4:
                return 3;
            case 3:
                return 4;
            case 2:
                return 5;
            default:
                return 6;
        }
    }
}
