package baseball.domain.entity.count;

import baseball.domain.entity.numbers.Numbers;
import java.util.List;

public class Strike implements Counter {
    private int count;
    private List<Integer> userNumbers;
    private List<Integer> randomNumbers;

    public Strike(Numbers userNumbers, Numbers randomNumbers) {
        this.userNumbers = userNumbers.getNumbers();
        this.randomNumbers = randomNumbers.getNumbers();
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
