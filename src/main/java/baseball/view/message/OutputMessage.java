package baseball.view.message;

public enum OutputMessage {
    BALL("%d볼"),
    STRIKE("%d스트라이크"),
    BALL_STRIKE("%d볼 %d스트라이크");

    private String message;

    OutputMessage(String message) {
        this.message = message;
    }

    public String getMessage(int count) {
        return String.format(this.message, count);
    }

    public String getMessage(int ball, int strike) {
        return String.format(this.message, ball, strike);
    }
}
