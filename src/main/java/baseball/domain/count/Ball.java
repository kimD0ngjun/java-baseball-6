package baseball.domain.count;

import baseball.domain.numbers.RandomNumbers;
import baseball.domain.numbers.UserNumbers;
import java.util.List;

public class Ball implements Counter {
    private int count;
    private List<Integer> userNumbers;
    private List<Integer> randomNumbers;

    public Ball(UserNumbers userNumbers, RandomNumbers randomNumbers) {
        this.userNumbers = userNumbers.getUserNumbers();
        this.randomNumbers = randomNumbers.getRandomNumbers();
        this.count = calculateCount();
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public int calculateCount() {
        int count = 0;

        for (int i = 0; i < randomNumbers.size(); i++) {
            int randomNumber = randomNumbers.get(i);
            if (userNumbers.contains(randomNumber) && userNumbers.indexOf(randomNumber) != i) {
                count++;
            }
        }

        return count;
    }
}
