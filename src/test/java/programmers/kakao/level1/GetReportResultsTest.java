package programmers.kakao.level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("신고 결과 받기")
class GetReportResultsTest {

    GetReportResults getReportResults = new GetReportResults();

    @Test
    void testCase1() {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
        int k = 2;

        int[] expected = {2, 1, 1, 0};

        assertThat(getReportResults.solution(id_list, report, k)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        String[] id_list = {"con", "ryan"};
        String[] report = {"ryan con", "ryan con", "ryan con", "ryan con"};
        int k = 3;

        int[] expected = {0, 0};

        assertThat(getReportResults.solution(id_list, report, k)).isEqualTo(expected);
    }
}