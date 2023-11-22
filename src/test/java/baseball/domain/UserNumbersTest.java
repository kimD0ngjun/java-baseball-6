package baseball.domain;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class UserNumbersTest {
    @DisplayName("문자열의 세 숫자가 입력되면 리스트 배열로 반환된다.")
    @Test
    void testChangeType() {
        String testInput = "123";
        UserNumbers testUserNumbers = new UserNumbers(testInput);

        List<Integer> testList = new ArrayList<>();
        testList.add(1);
        testList.add(2);
        testList.add(3);

        assertThat(testUserNumbers.getUserNumbers()).isEqualTo(testList);
    }

    @DisplayName("문자열 입력값에 공백을 포함하면 예외 처리한다.")
    @Test
    void testBlank() {
        String[] wrongCases = {"", " ", "123 ", " 123", "1 23", "1 23"};

        for (String wrongCase : wrongCases) {
            assertThatThrownBy(() -> new UserNumbers(wrongCase));
        }
    }

    @DisplayName("문자열 입력값 길이가 3이 아니면 예외 처리한다.")
    @Test
    void testLength() {
        String[] wrongCases = {"12", "1234", "1"};

        for (String wrongCase : wrongCases) {
            assertThatThrownBy(() -> new UserNumbers(wrongCase));
        }
    }

    @DisplayName("문자열 입력값 타입 변환 문자값이 숫자(Integer)가 아니면 예외 처리한다.")
    @Test
    void testNumberType() {
        String[] wrongCases = {"12가", "-13", "12a"};

        for (String wrongCase : wrongCases) {
            assertThatThrownBy(() -> new UserNumbers(wrongCase));
        }
    }

    @DisplayName("문자열 입력값 타입 변환 문자값의 범위는 1부터 9까지다.")
    @Test
    void testNumberRange() {
        String[] wrongCases = {"120", "103", "085"};

        for (String wrongCase : wrongCases) {
            assertThatThrownBy(() -> new UserNumbers(wrongCase));
        }
    }
}
