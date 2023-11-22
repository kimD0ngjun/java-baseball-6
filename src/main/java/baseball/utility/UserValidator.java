package baseball.utility;

import java.util.regex.Pattern;

public class UserValidator {
    private static final String VALIDATE = "^[1-9]*$";
    private static final int LENGTH = 3;

    // to prevent instantiation
    private UserValidator() {
    }

    // validate
    public static void validate(String inputNumbers) {
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
