package programmers.level_0.introduction;

public class CountOfDice {

    public int solution(int[] box, int n) {
        return (box[0] / n) * (box[1] / n) * (box[2] / n);
    }
}
