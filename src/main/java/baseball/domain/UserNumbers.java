package baseball.domain;

import java.util.ArrayList;
import java.util.List;

public class UserNumbers {
    private final List<Integer> userNumbers;

    public UserNumbers(String inputNumber) {
        this.userNumbers = changeType(inputNumber);
    }

    // for test-code and encapsulation
    public List<Integer> getUserNumbers() {
        return userNumbers;
    }

    // type change
    private List<Integer> changeType(String inputNumber) {
        List<Integer> resultList = new ArrayList<>();

        for (int i = 0; i < inputNumber.length(); i++) {
            char unitCharacter = inputNumber.charAt(i);

            int digit = Character.getNumericValue(unitCharacter);
            resultList.add(digit);
        }

        return resultList;
    }

    // validate
}
