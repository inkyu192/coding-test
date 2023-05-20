package programmers.level_0.introduction;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("로그인 성공?")
class LoginSucceedTest {

    LoginSucceed test = new LoginSucceed();

    @Test
    void case1() {
        String[] id_pw = {"meosseugi", "1234"};
        String[][] db = {{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}};

        String result = "login";

        assertThat(test.solution(id_pw, db)).isEqualTo(result);
    }

    @Test
    void case2() {
        String[] id_pw = {"programmer01", "15789"};
        String[][] db = {{"programmer02", "111111"}, {"programmer00", "134"}, {"programmer01", "1145"}};

        String result = "wrong pw";

        assertThat(test.solution(id_pw, db)).isEqualTo(result);
    }

    @Test
    void case3() {
        String[] id_pw = {"rabbit04", "98761"};
        String[][] db = {{"jaja11", "98761"}, {"krong0313", "29440"}, {"rabbit00", "111333"}};

        String result = "fail";

        assertThat(test.solution(id_pw, db)).isEqualTo(result);
    }
}