package programmers.introduction.level0;

public class CurseNumberThree {

    public int solution(int n) {
        for (int i = 1; i <= n; i++) {
            String str = String.valueOf(i);

            if (str.contains("3") || i % 3 == 0) {
                n++;
            }
        }

        return n;
    }
}
