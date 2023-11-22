package baseball.domain.count;

import baseball.domain.RandomNumbers;
import baseball.domain.UserNumbers;
import java.util.List;

public class Strike implements Counter {
    private int count;
    private List<Integer> userNumbers;
    private List<Integer> randomNumbers;

    public Strike(UserNumbers userNumbers, RandomNumbers randomNumbers) {
        this.userNumbers = userNumbers.getUserNumbers();
        this.randomNumbers = randomNumbers.getRandomNumbers();
        this.count = calculateCount();
    }

    // for test-code and encapsulation
    public int getCount() {
        return count;
    }

    @Override
    public int calculateCount() {
        int count = 0;

        for (int i = 0; i < randomNumbers.size(); i++) {
            int userNumber = userNumbers.get(i);
            if (randomNumbers.get(i).equals(userNumber)) {
                count++;
            }
        }
        return count;
    }
}
