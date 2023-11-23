package baseball.domain.dto;

// 불변 객체로써 dto를 만들 때는 생성자를 이용해서 구현시 getter() 메소드만 구현할 수 있다.
public class CountDto {
    private final int ball;
    private final int strike;

    public CountDto(int ball, int strike) {
        this.ball = ball;
        this.strike = strike;
    }

    public int getBall() {
        return ball;
    }

    public int getStrike() {
        return strike;
    }
}

