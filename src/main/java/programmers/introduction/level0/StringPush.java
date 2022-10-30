package programmers.introduction.level0;

public class StringPush {

    public int solution(String A, String B) {
        int answer = -1;
        int index = 0;

        while (index < A.length()) {
            String s = A.substring(A.length() - index) + A.substring(0, A.length() - index);

            if (s.equals(B)) {
                answer = index;
                break;
            }

            index++;
        }

        return answer;
    }
}
