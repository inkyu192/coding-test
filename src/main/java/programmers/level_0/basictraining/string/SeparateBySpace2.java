package programmers.level_0.basictraining.string;

import java.util.ArrayList;
import java.util.List;

public class SeparateBySpace2 {

    public String[] solution(String my_string) {
        List<String> list = new ArrayList<>();

        for (String s : my_string.split(" ")) {
            if (!s.equals("")) {
                list.add(s);
            }
        }

        return list.toArray(new String[0]);
    }
}
