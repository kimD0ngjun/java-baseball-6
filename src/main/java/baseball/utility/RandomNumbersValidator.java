package baseball.utility;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RandomNumbersValidator {

    // to prevent instantiation
    private RandomNumbersValidator() {
    }

    public static boolean checkDuplicates(List<Integer> numbers) {
        Set<Integer> set = new HashSet<>();

        for (int num : numbers) {
            if (!set.add(num)) {
                return true;
            }
        }
        return false;
    }
}
