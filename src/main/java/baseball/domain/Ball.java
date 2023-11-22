package baseball.domain;

public class Ball extends Counter {
    public Ball(UserNumbers userNumbers, RandomNumbers randomNumbers) {
        super(userNumbers, randomNumbers);
        this.count = calculateCount();
    }

    @Override
    protected int calculateCount() {
        int count = 0;

        for (int i = 0; i < super.randomNumbers.size(); i++) {
            int randomNumber = super.randomNumbers.get(i);
            if (userNumbers.contains(randomNumber) && userNumbers.indexOf(randomNumber) != i) {
                count++;
            }
        }

        return count;
    }
}
