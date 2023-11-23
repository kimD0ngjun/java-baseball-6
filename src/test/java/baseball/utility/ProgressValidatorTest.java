package baseball.utility;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ProgressValidatorTest {
    @DisplayName("1과 2 이외의 값을 입력하면 예외 처리한다.")
    @Test
    void testProgress() {
        String[] wrongCases = {"", " ", "3", "12", "@", "가", "a"};

        for (String wrongCase : wrongCases) {
            assertThatThrownBy(() -> ProgressValidator.validateProgress(wrongCase));
        }
    }
}
