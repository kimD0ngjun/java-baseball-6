package baseball.domain;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
        } while (hasDuplicates(randomNumbers));

        return randomNumbers;
    }

    private boolean hasDuplicates(List<Integer> numbers) {
        Set<Integer> set = new HashSet<>();

        for (int num : numbers) {
            if (!set.add(num)) {
                return true;
            }
        }
        return false;
    }
}
