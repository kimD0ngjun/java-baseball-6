package baseball.domain;

public class Count {
    protected int count;
    protected UserNumbers userNumbers;
    protected RandomNumbers randomNumbers;

    public Count(UserNumbers userNumbers, RandomNumbers randomNumbers) {
        this.count = 0;
        this.userNumbers = userNumbers;
        this.randomNumbers = randomNumbers;
    }

    protected void increment() {
        this.count++;
    }
}
