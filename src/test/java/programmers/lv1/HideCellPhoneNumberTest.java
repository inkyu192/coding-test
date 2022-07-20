package programmers.lv1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("핸드폰 번호 가리기")
class HideCellPhoneNumberTest {

    HideCellPhoneNumber hideCellPhoneNumber = new HideCellPhoneNumber();

    @Test
    void testCase1() {
        String phone_number = "01033334444";

        String expected = "*******4444";

        assertThat(hideCellPhoneNumber.solution(phone_number)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        String phone_number = "027778888";

        String expected = "*****8888";

        assertThat(hideCellPhoneNumber.solution(phone_number)).isEqualTo(expected);
    }
}