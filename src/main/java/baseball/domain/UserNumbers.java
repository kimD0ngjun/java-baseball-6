package baseball.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class UserNumbers {
    private final List<Integer> userNumbers;

    private final String VALIDATE = "^[1-9]*$";
    ;
    private final int LENGTH = 3;

    public UserNumbers(String inputNumber) {
        this.userNumbers = changeType(inputNumber);
    }

    // for test-code and encapsulation
    public List<Integer> getUserNumbers() {
        return userNumbers;
    }

    // type change
    private List<Integer> changeType(String inputNumber) {
        validate(inputNumber);
        List<Integer> resultList = new ArrayList<>();

        for (int i = 0; i < inputNumber.length(); i++) {
            char unitCharacter = inputNumber.charAt(i);
            int digit = Character.getNumericValue(unitCharacter);

            resultList.add(digit);
        }

        return resultList;
    }

    // validate
    private void validate(String inputNumbers) {
        checkLength(inputNumbers);
        validateInputValue(inputNumbers);
    }

    //Doesn't it have blank?
    //Is its type a number?
    // Is its range between 1 and 9?
    private void validateInputValue(String inputNumbers) {
        if (!Pattern.matches(VALIDATE, inputNumbers) || inputNumbers.isBlank()) {
            throw new IllegalArgumentException();
        }
    }

    //Is its length 3?
    private void checkLength(String inputNumbers) {
        if (inputNumbers.length() != 3) {
            throw new IllegalArgumentException();
        }
    }
}
