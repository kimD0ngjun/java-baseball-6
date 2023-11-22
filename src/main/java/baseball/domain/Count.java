package baseball.domain;

public class Count {
    private int count;
    private UserNumbers userNumbers;
    private RandomNumbers randomNumbers;

    public Count(UserNumbers userNumbers, RandomNumbers randomNumbers) {
        this.count = 0;
        this.userNumbers = userNumbers;
        this.randomNumbers = randomNumbers;
    }

    public void increment() {
        this.count++;
    }
}
