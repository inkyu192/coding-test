package programmers.kakao.level1;

public class KeypadPress {

    public String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();
        int[][] keypadPosition = {{1, 0}, {0, 3}, {1, 3}, {2, 3}, {0, 2}, {1, 2}, {2, 2}, {0, 1}, {1, 1}, {2, 1}};
        int[] leftPosition = {0, 0};
        int[] rightPosition = {2, 0};

        for (int number : numbers) {
            if (number == 1 || number == 4 || number == 7) {
                sb.append("L");
                leftPosition = keypadPosition[number];
            } else if (number == 3 || number == 6 || number == 9) {
                sb.append("R");
                rightPosition = keypadPosition[number];
            } else {
                int leftDistance = Math.abs(keypadPosition[number][0] - leftPosition[0]) + Math.abs(keypadPosition[number][1] - leftPosition[1]);
                int rightDistance = Math.abs(keypadPosition[number][0] - rightPosition[0]) + Math.abs(keypadPosition[number][1] - rightPosition[1]);

                if (leftDistance < rightDistance) {
                    sb.append("L");
                    leftPosition = keypadPosition[number];
                } else if (leftDistance > rightDistance) {
                    sb.append("R");
                    rightPosition = keypadPosition[number];
                } else {
                    if (hand.equals("left")) {
                        sb.append("L");
                        leftPosition = keypadPosition[number];
                    } else if (hand.equals("right")) {
                        sb.append("R");
                        rightPosition = keypadPosition[number];
                    }
                }
            }
        }

        return sb.toString();
    }
}
