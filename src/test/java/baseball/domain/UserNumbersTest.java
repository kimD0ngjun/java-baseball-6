package baseball.domain;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import baseball.domain.numbers.UserNumbers;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class UserNumbersTest {
    @DisplayName("입력값은 비교 검증 및 출력을 위해 리스트화 되어야 한다.")
    @Test
    void testChangeType() {
        String testInput = "123";
        UserNumbers testUserNumbers = new UserNumbers(testInput);

        List<Integer> testList = new ArrayList<>();
        testList.add(1);
        testList.add(2);
        testList.add(3);

        assertThat(testUserNumbers.getNumbers()).isEqualTo(testList);
    }
}
