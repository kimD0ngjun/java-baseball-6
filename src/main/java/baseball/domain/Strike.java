package baseball.domain;

public class Strike extends Counter {
    public Strike(UserNumbers userNumbers, RandomNumbers randomNumbers) {
        super(userNumbers, randomNumbers);
        this.count = calculateCount();
    }

    @Override
    protected int calculateCount() {
        int count = 0;

        for (int i = 0; i < super.randomNumbers.size(); i++) {
            int userNumber = super.userNumbers.get(i);
            if (super.randomNumbers.get(i).equals(userNumber)) {
                count++;
            }
        }
        return count;
    }
}
