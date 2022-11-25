package programmers.hash.level2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("전화번호 목록")
class PhoneNumberListTest {

    PhoneNumberList phoneNumberList = new PhoneNumberList();

    @Test
    void testCase1() {
        String[] phone_book = {"119", "97674223", "1195524421"};

        assertThat(phoneNumberList.solution(phone_book)).isFalse();
    }

    @Test
    void testCase2() {
        String[] phone_book = {"123","456","789"};

        assertThat(phoneNumberList.solution(phone_book)).isTrue();
    }

    @Test
    void testCase3() {
        String[] phone_book = {"12","123","1235","567","88"};

        assertThat(phoneNumberList.solution(phone_book)).isFalse();
    }
}