package baseball.controller;

import baseball.service.GameRetryer;
import baseball.view.input.Input;
import baseball.view.input.Progress;
import baseball.view.message.GuideMessage;

public class EventAssembler {
    private final String RETRY = "1";

    public void startBaseball() {
        System.out.println(GuideMessage.START_MESSAGE.getMessage());
        do {
            GameController game = new GameController();
            game.gamePhase();
        } while (retryGame());
    }

    private boolean retryGame() {
        Input progress = new Progress();
        GameRetryer retry = new GameRetryer(progress.inputValue());
        if (retry.getProgress().equals(RETRY)) {
            return true;
        }
        return false;
    }
}
