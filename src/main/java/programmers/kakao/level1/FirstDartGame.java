package programmers.kakao.level1;

public class FirstDartGame {

    public int solution(String dartResult) {
        String temp = "";
        int[] arr = new int[3];
        int idx = 0;

        for (int i = 0; i < dartResult.length(); i++) {
            switch (dartResult.charAt(i)) {
                case '*':
                    arr[idx - 1] *= 2;
                    if (idx > 1) arr[idx - 2] *= 2;
                    break;
                case '#':
                    arr[idx - 1] *= -1;
                    break;
                case 'S':
                    arr[idx] = (int) Math.pow(Integer.parseInt(temp), 1);
                    idx++;
                    temp = "";
                    break;
                case 'D':
                    arr[idx] = (int) Math.pow(Integer.parseInt(temp), 2);
                    idx++;
                    temp = "";
                    break;
                case 'T':
                    arr[idx] = (int) Math.pow(Integer.parseInt(temp), 3);
                    idx++;
                    temp = "";
                    break;
                default:
                    temp += String.valueOf(dartResult.charAt(i));
                    break;
            }
        }

        int answer = 0;
        for (int i : arr) {
            answer += i;
        }

        return answer;
    }
}
