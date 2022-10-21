package programmers.kakao.level1;

public class FirstSecretMap {

    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] s1 = new String[n];
        String[] s2 = new String[n];

        for (int i = 0; i < n; i++) {
            s1[i] = lpad(Integer.toString(arr1[i], 2), n);
            s2[i] = lpad(Integer.toString(arr2[i], 2), n);
        }

        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < n; j++) {
                char c1 = s1[i].charAt(j);
                char c2 = s2[i].charAt(j);

                if (c1 == '0' && c2 == '0') {
                    sb.append(" ");
                } else {
                    sb.append("#");
                }
            }

            answer[i] = sb.toString();
        }

        return answer;
    }

    private String lpad(String s, int length) {
        while (s.length() != length) {
            s = "0" + s;
        }
        return s;
    }
}
