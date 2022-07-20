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

        assertThat(hideCellPhoneNumber.solution(phone_number)).isEqualTo("*******4444");
    }

    @Test
    void testCase2() {
        String phone_number = "027778888";

        assertThat(hideCellPhoneNumber.solution(phone_number)).isEqualTo("*****8888");
    }
}