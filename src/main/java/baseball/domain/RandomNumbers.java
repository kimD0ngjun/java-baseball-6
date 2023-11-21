package baseball.domain;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RandomNumbers {
    private final List<Integer> randomNumbers;

    public RandomNumbers() {
        this.randomNumbers = getRandomNumbers();
    }

    private List<Integer> getRandomNumbers() {
        List<Integer> randomNumber;
        do {
            randomNumber = new ArrayList<>(Randoms.pickUniqueNumbersInRange(1, 9, 3));
        } while (!hasDuplicates(randomNumber));

        return Collections.unmodifiableList(randomNumber);
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
