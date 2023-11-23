package baseball.view.message;

public enum GuideMessage {
    START_MESSAGE("숫자 야구 게임을 시작합니다."),
    END_MESSAGE("3개의 숫자를 모두 맞히셨습니다! 게임 종료");

    private final String message;

    GuideMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
