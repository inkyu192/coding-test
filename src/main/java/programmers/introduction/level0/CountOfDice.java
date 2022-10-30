package programmers.introduction.level0;

public class CountOfDice {

    public int solution(int[] box, int n) {
        return (box[0] / n) * (box[1] / n) * (box[2] / n);
    }
}
