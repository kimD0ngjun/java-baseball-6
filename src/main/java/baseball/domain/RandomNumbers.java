package baseball.domain;

import static baseball.utility.RandomNumbersValidator.checkDuplicates;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class RandomNumbers {
    private final List<Integer> randomNumbers;

    public RandomNumbers() {
        this.randomNumbers = generateRandomNumbers();
    }

    // for test-code and encapsulation
    public List<Integer> getRandomNumbers() {
        return randomNumbers;
    }

    private List<Integer> generateRandomNumbers() {
        List<Integer> randomNumbers;
        do {
            randomNumbers = new ArrayList<>(Randoms.pickUniqueNumbersInRange(1, 9, 3));
        } while (checkDuplicates(randomNumbers));

        return randomNumbers;
    }
}
