package programmers.level_0.basictraining.condition;

public class ReturnDifferentValuesDependingOnFlag {

    public int solution(int a, int b, boolean flag) {
        return flag ? a + b : a - b;
    }
}
