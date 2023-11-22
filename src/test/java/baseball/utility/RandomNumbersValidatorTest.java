package baseball.utility;

import static baseball.utility.RandomNumbersValidator.checkDuplicates;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RandomNumbersValidatorTest {
    @DisplayName("중복된 숫자가 포함되면 참을 반환한다.")
    @Test
    void testDuplicates() {
        List<Integer> unDuplicatedList = new ArrayList<>();

        unDuplicatedList.add(1);
        unDuplicatedList.add(2);
        unDuplicatedList.add(3);

        List<Integer> duplicatedList = new ArrayList<>();

        duplicatedList.add(1);
        duplicatedList.add(2);
        duplicatedList.add(2);

        assertTrue(checkDuplicates(duplicatedList));
        assertFalse(checkDuplicates(unDuplicatedList));
    }
}
