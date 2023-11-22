package baseball.domain;

public class Ball extends Counter {
    public Ball(UserNumbers userNumbers, RandomNumbers randomNumbers) {
        super(userNumbers, randomNumbers);
        this.count = calculateCount();
    }

    @Override
    protected int calculateCount() {
        int count = 0;

        for (int number : super.randomNumbers) {
            if (userNumbers.contains(number)) {
                count++;
            }
        }
        return count;
    }
}
