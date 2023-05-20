package programmers.level_0.introduction;

public class CurseNumberThree {

    public int solution(int n) {
        for (int i = 1; i <= n; i++) {
            if (String.valueOf(i).contains("3") || i % 3 == 0) {
                n++;
            }
        }

        return n;
    }
}
