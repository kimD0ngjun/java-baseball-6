package baseball.view.message;

public enum GuideMessage {
    START_MESSAGE("숫자 야구 게임을 시작합니다.");

    private final String message;

    GuideMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
