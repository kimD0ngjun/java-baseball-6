package baseball.utility;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class UserNumbersValidatorTest {
    @DisplayName("문자열 입력값에 공백을 포함하면 예외 처리한다.")
    @Test
    void testBlank() {
        String[] wrongCases = {"", " ", "123 ", " 123", "1 23", "1 23"};

        for (String wrongCase : wrongCases) {
            assertThatThrownBy(() -> UserNumbersValidator.validate(wrongCase));
        }
    }

    @DisplayName("문자열 입력값 길이가 3이 아니면 예외 처리한다.")
    @Test
    void testLength() {
        String[] wrongCases = {"12", "1234", "1"};

        for (String wrongCase : wrongCases) {
            assertThatThrownBy(() -> UserNumbersValidator.validate(wrongCase));
        }
    }

    @DisplayName("문자열 입력값 타입 변환 문자값이 숫자(Integer)가 아니면 예외 처리한다.")
    @Test
    void testNumberType() {
        String[] wrongCases = {"12가", "-13", "12a"};

        for (String wrongCase : wrongCases) {
            assertThatThrownBy(() -> UserNumbersValidator.validate(wrongCase));
        }
    }

    @DisplayName("문자열 입력값 타입 변환 문자값의 범위는 1부터 9까지다.")
    @Test
    void testNumberRange() {
        String[] wrongCases = {"120", "103", "085"};

        for (String wrongCase : wrongCases) {
            assertThatThrownBy(() -> UserNumbersValidator.validate(wrongCase));
        }
    }

    @DisplayName("중복된 숫자를 입력하면 예외 처리한다.")
    @Test
    void testDuplicates() {
        String[] wrongCases = {"122", "333", "646"};

        for (String wrongCase : wrongCases) {
            assertThatThrownBy(() -> UserNumbersValidator.checkForDuplicates(wrongCase));
        }
    }
}
