package baseball.service;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class UserNumberConverterTest {
    @DisplayName("문자열의 세 숫자가 입력되면 리스트 배열로 반환된다.")
    @Test
    void testChangeType() {
        String testInput = "123";
        List<Integer> testCase = UserNumbersConverter.changeType(testInput);

        List<Integer> testList = new ArrayList<>();
        testList.add(1);
        testList.add(2);
        testList.add(3);

        assertThat(testCase).isEqualTo(testList);
    }
}
