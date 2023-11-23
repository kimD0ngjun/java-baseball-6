package baseball.domain.count;

import baseball.domain.numbers.Numbers;
import java.util.List;

public class Ball implements Counter {
    private int count;
    private List<Integer> userNumbers;
    private List<Integer> randomNumbers;

    public Ball(Numbers userNumbers, Numbers randomNumbers) {
        this.userNumbers = userNumbers.getNumbers();
        this.randomNumbers = randomNumbers.getNumbers();
        this.count = calculateCount();
    }

    // for test-code and encapsulation
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
