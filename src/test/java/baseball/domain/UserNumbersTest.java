package baseball.domain;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class UserNumbersTest {
    @DisplayName("문자열의 세 숫자가 입력되면 리스트 배열로 반환된다.")
    @Test
    void changeTypeTest() {
        String testInput = "123";
        UserNumbers testUserNumbers = new UserNumbers(testInput);

        List<Integer> testList = new ArrayList<>();
        testList.add(1);
        testList.add(2);
        testList.add(3);

        assertThat(testUserNumbers.getUserNumbers()).isEqualTo(testList);
    }
}
