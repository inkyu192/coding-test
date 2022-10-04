package programmers.practice.level1;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class TwoThousandSixteenYear {

    public String solution(int a, int b) {
        LocalDate localDate = LocalDate.of(2016, a, b);
        DayOfWeek day = localDate.getDayOfWeek();

        return day.toString().substring(0, 3);
    }
}
