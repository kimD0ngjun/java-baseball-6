package baseball.domain.entity.numbers;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class RandomNumbers implements Numbers {
    private final List<Integer> randomNumbers;

    public RandomNumbers() {
        this.randomNumbers = generateNumbers();
    }

    // for test-code and encapsulation
    @Override
    public List<Integer> getNumbers() {
        return randomNumbers;
    }

    @Override
    public List<Integer> generateNumbers() {
        List<Integer> randomNumbers = new ArrayList<>();
        while (randomNumbers.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!randomNumbers.contains(randomNumber)) {
                randomNumbers.add(randomNumber);
            }
        }
        return randomNumbers;
    }
}
