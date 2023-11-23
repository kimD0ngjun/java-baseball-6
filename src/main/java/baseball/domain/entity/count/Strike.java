package baseball.domain.entity.count;

import baseball.domain.dto.CountDto;
import baseball.domain.entity.numbers.Numbers;
import java.util.List;

public class Strike implements Count {
    private List<Integer> userNumbers;
    private List<Integer> randomNumbers;

    public Strike(Numbers userNumbers, Numbers randomNumbers) {
        this.userNumbers = userNumbers.getNumbers();
        this.randomNumbers = randomNumbers.getNumbers();
    }

//    // for test-code and encapsulation
//    public int getCount() {
//        return count;
//    }

    @Override
    public CountDto calculateCount() {
        int count = 0;

        for (int i = 0; i < randomNumbers.size(); i++) {
            int userNumber = userNumbers.get(i);
            if (randomNumbers.get(i).equals(userNumber)) {
                count++;
            }
        }
        return new CountDto(0, count);
    }
}
