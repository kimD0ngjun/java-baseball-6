package baseball.domain;

import java.util.List;

public class Counter {
    protected int count;
    protected List<Integer> userNumbers;
    protected List<Integer> randomNumbers;

    public Counter(UserNumbers userNumbers, RandomNumbers randomNumbers) {
        this.count = 0;
        this.userNumbers = userNumbers.getUserNumbers();
        this.randomNumbers = randomNumbers.getRandomNumbers();
    }

    // for test-code and encapsulation
    public int getCount() {
        return count;
    }

    protected int calculateCount() {
        return 0;
    }
}
