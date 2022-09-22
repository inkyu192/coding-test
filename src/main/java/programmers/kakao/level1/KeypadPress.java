package programmers.kakao.level1;

public class KeypadPress {

    public String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();

        int[] leftPosition = {3, 0};
        int[] rightPosition = {3, 2};
        int[][] keypad = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {-1, 0, -1}};

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < keypad.length; j++) {
                for (int k = 0; k < keypad[j].length; k++) {
                    if (numbers[i] == keypad[j][k]) {
                        if (numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
                            leftPosition[0] = j;
                            leftPosition[1] = k;
                            answer.append("L");
                        } else if (numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
                            rightPosition[0] = j;
                            rightPosition[1] = k;
                            answer.append("R");
                        } else {
                            int leftPositionDistance = Math.abs(leftPosition[0] - j) + Math.abs(leftPosition[1] - k);
                            int rightPositionDistance = Math.abs(rightPosition[0] - j) + Math.abs(rightPosition[1] - k);

                            if (leftPositionDistance > rightPositionDistance) {
                                rightPosition[0] = j;
                                rightPosition[1] = k;
                                answer.append("R");
                            } else if (leftPositionDistance < rightPositionDistance) {
                                leftPosition[0] = j;
                                leftPosition[1] = k;
                                answer.append("L");
                            } else {
                                if (hand.equals("right")) {
                                    rightPosition[0] = j;
                                    rightPosition[1] = k;
                                    answer.append("R");
                                } else {
                                    leftPosition[0] = j;
                                    leftPosition[1] = k;
                                    answer.append("L");
                                }
                            }
                        }
                    }
                }
            }
        }

        return answer.toString();
    }
}
