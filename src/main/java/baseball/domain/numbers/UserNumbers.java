package baseball.domain.numbers;

import baseball.service.UserNumbersConverter;
import java.util.List;

public class UserNumbers implements Numbers {
    private final List<Integer> userNumbers;
    private String inputNumbers;

    public UserNumbers(String inputNumbers) {
        this.userNumbers = generateNumbers();
        this.inputNumbers = inputNumbers;
    }

    // for test-code and encapsulation
    @Override
    public List<Integer> getNumbers() {
        return userNumbers;
    }

    @Override
    public List<Integer> generateNumbers() {
        return UserNumbersConverter.changeType(inputNumbers);
    }
}
