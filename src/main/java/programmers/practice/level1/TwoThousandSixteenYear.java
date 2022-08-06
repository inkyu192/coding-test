package programmers.practice.level1;

import java.time.LocalDate;

public class TwoThousandSixteenYear {

    public String solution(int a, int b) {
        return LocalDate.of(2016, a, b).getDayOfWeek().toString().substring(0, 3);
    }
}
