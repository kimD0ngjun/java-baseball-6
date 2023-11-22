package baseball.domain;

public class Strike extends Counter {
    public Strike(UserNumbers userNumbers, RandomNumbers randomNumbers) {
        super(userNumbers, randomNumbers);
        this.count = calculateCount();
    }

    @Override
    protected int calculateCount() {
        int count = 0;

        for (int i = 0; i < userNumbers.size(); i++) {
            if (userNumbers.get(i).equals(randomNumbers.get(i))) {
                count++;
            }
        }
        return count;
    }
}
