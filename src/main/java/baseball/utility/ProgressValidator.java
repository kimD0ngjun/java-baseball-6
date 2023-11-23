package baseball.utility;

import java.util.regex.Pattern;

public class ProgressValidator {
    private static final String PATTERN = "[12]";

    // to prevent instantiation
    private ProgressValidator() {
    }

    public static void validateProgress(String progress) {
        if (!Pattern.matches(PATTERN, progress)) {
            throw new IllegalArgumentException();
        }
    }
}
