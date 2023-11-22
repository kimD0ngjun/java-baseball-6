package baseball.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class UserNumbers {
    private final List<Integer> userNumbers;

    private final String CHECK_BLANK = "^[0-9|a-z|A-Z|ㄱ-ㅎ|ㅏ-ㅣ|가-힣]*$";
    private final int NOT_NUMBER = -1;

    public UserNumbers(String inputNumber) {
        this.userNumbers = changeType(inputNumber);
    }

    // for test-code and encapsulation
    public List<Integer> getUserNumbers() {
        return userNumbers;
    }

    // type change
    private List<Integer> changeType(String inputNumber) {
        validateBlank(inputNumber);
        validateLength(inputNumber);

        List<Integer> resultList = new ArrayList<>();

        for (int i = 0; i < inputNumber.length(); i++) {
            char unitCharacter = inputNumber.charAt(i);

            int digit = Character.getNumericValue(unitCharacter);
            validateNumberType(digit);

            resultList.add(digit);
        }

        return resultList;
    }

    // validate
    //Doesn't it have blank?
    private void validateBlank(String inputNumbers) {
        if (!Pattern.matches(CHECK_BLANK, inputNumbers) || inputNumbers.isBlank()) {
            throw new IllegalArgumentException();
        }
    }

    //Is its length 3?
    private void validateLength(String inputNumbers) {
        if (inputNumbers.length() != 3) {
            throw new IllegalArgumentException();
        }
    }

    //Is its type a number?
    private void validateNumberType(int digit) {
        if (digit == NOT_NUMBER) {
            throw new IllegalArgumentException();
        }
    }

    //TODO Is its range between 1 and 9?
}
