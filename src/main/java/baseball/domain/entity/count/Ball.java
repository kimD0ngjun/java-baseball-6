package baseball.domain.entity.count;

import baseball.domain.dto.CountDto;
import baseball.domain.entity.numbers.Numbers;
import java.util.List;

public class Ball implements Count {
    private List<Integer> userNumbers;
    private List<Integer> randomNumbers;

    public Ball(Numbers userNumbers, Numbers randomNumbers) {
        this.userNumbers = userNumbers.getNumbers();
        this.randomNumbers = randomNumbers.getNumbers();
    }

//    // for test-code and encapsulation
//    @Override
//    public int getCount() {
//        return count;
//    }

    @Override
    public CountDto calculateCount() {
        int count = 0;

        for (int i = 0; i < randomNumbers.size(); i++) {
            int randomNumber = randomNumbers.get(i);
            if (userNumbers.contains(randomNumber) && userNumbers.indexOf(randomNumber) != i) {
                count++;
            }
        }

        return new CountDto(count, 0);
    }
}
