package baseball.service;

import baseball.utility.UserNumbersValidator;
import java.util.ArrayList;
import java.util.List;

public class UserNumbersConverter {

    // to prevent instantiation
    private UserNumbersConverter() {
    }

    public static List<Integer> changeType(String inputNumber) {
        UserNumbersValidator.validate(inputNumber);
        List<Integer> resultList = new ArrayList<>();

        for (int i = 0; i < inputNumber.length(); i++) {
            char unitCharacter = inputNumber.charAt(i);
            int digit = Character.getNumericValue(unitCharacter);

            resultList.add(digit);
        }

        return resultList;
    }
}
