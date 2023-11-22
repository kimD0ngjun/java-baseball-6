package baseball.utility;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

public class UserNumbersValidator {
    private static final String VALIDATE = "^[1-9]*$";
    private static final int LENGTH = 3;

    // to prevent instantiation
    private UserNumbersValidator() {
    }

    // validate
    public static void validate(String inputNumbers) {
        checkLength(inputNumbers);
        checkForDuplicates(inputNumbers);
        validateInputValue(inputNumbers);
    }

    // Doesn't it have blank?
    // Is its type a number?
    // Is its range between 1 and 9?
    private static void validateInputValue(String inputNumbers) {
        if (!Pattern.matches(VALIDATE, inputNumbers) || inputNumbers.isBlank()) {
            throw new IllegalArgumentException();
        }
    }

    // Doesn't it have duplicates?
    public static void checkForDuplicates(String inputNumbers) {
        Set<Character> uniqueChars = new HashSet<>();

        for (char ch : inputNumbers.toCharArray()) {
            if (!uniqueChars.add(ch)) {
                throw new IllegalArgumentException();
            }
        }
    }

    //Is its length 3?
    private static void checkLength(String inputNumbers) {
        if (inputNumbers.length() != LENGTH) {
            throw new IllegalArgumentException();
        }
    }
}
