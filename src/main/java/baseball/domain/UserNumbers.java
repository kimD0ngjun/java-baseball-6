package baseball.domain;

import baseball.service.UserNumbersConverter;
import java.util.List;

public class UserNumbers {
    private final List<Integer> userNumbers;

    public UserNumbers(String inputNumber) {
        this.userNumbers = UserNumbersConverter.changeType(inputNumber);
    }

    // for test-code and encapsulation
    public List<Integer> getUserNumbers() {
        return userNumbers;
    }
}
