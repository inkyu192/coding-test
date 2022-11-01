package programmers.introduction.level0;

public class SumPolynomial {

    public String solution(String polynomial) {
        int x = 0;
        int constant = 0;
        String[] split = polynomial.split(" \\+ ");

        for (int i = 0; i < split.length; i++) {
            String str = split[i];

            if (str.contains("x")) {
                String substring = str.substring(0, str.length() - 1);

                if (substring.equals("")) {
                    x++;
                } else {
                    x += Integer.parseInt(substring);
                }
            } else {
                constant += Integer.parseInt(str);
            }
        }

        StringBuilder sb = new StringBuilder();

        if (x != 0) {
            if (x == 1) {
                sb.append("x");
            } else {
                sb.append(x).append("x");
            }
        }

        if (x != 0 && constant != 0) {
            sb.append(" + ");
        }

        if (constant != 0) {
            sb.append(constant);
        }

        return sb.toString();
    }
}
