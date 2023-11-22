package baseball.service;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class UserNumbersConverter {
    private static final String VALIDATE = "^[1-9]*$";
    private static final int LENGTH = 3;

    // to prevent instantiation
    private UserNumbersConverter() {
    }

    public static List<Integer> changeType(String inputNumber) {
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
    private static void validate(String inputNumbers) {
        checkLength(inputNumbers);
        validateInputValue(inputNumbers);
    }

    //Doesn't it have blank?
    //Is its type a number?
    // Is its range between 1 and 9?
    private static void validateInputValue(String inputNumbers) {
        if (!Pattern.matches(VALIDATE, inputNumbers) || inputNumbers.isBlank()) {
            throw new IllegalArgumentException();
        }
    }

    //Is its length 3?
    private static void checkLength(String inputNumbers) {
        if (inputNumbers.length() != LENGTH) {
            throw new IllegalArgumentException();
        }
    }
}
