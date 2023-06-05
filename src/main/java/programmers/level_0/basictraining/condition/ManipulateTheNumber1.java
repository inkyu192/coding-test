package programmers.level_0.basictraining.condition;

public class ManipulateTheNumber1 {

    public int solution(int n, String control) {
        int answer = 0;

        for (char c : control.toCharArray()) {
            if (c == 'w') answer += 1;
            else if (c == 's') answer -= 1;
            else if (c == 'd') answer += 10;
            else if (c == 'a') answer -= 10;
        }

        return answer;
    }
}
