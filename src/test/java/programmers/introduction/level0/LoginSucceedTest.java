package programmers.introduction.level0;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("로그인 성공?")
class LoginSucceedTest {

    LoginSucceed loginSucceed = new LoginSucceed();

    @Test
    void testCase1() {
        String[] id_pw = {"meosseugi", "1234"};
        String[][] db = {{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}};

        String expected = "login";

        assertThat(loginSucceed.solution(id_pw, db)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        String[] id_pw = {"programmer01", "15789"};
        String[][] db = {{"programmer02", "111111"}, {"programmer00", "134"}, {"programmer01", "1145"}};

        String expected = "wrong pw";

        assertThat(loginSucceed.solution(id_pw, db)).isEqualTo(expected);
    }

    @Test
    void testCase3() {
        String[] id_pw = {"rabbit04", "98761"};
        String[][] db = {{"jaja11", "98761"}, {"krong0313", "29440"}, {"rabbit00", "111333"}};

        String expected = "fail";

        assertThat(loginSucceed.solution(id_pw, db)).isEqualTo(expected);
    }
}