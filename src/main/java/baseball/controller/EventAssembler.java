package baseball.controller;

import baseball.view.input.Input;
import baseball.view.input.Progress;

public class EventAssembler {
    private final String RETRY = "1";

    public void startBaseball() {
        do {
            GameController game = new GameController();
            game.gamePhase();
        } while (retryGame());
    }

    private boolean retryGame() {
        Input progress = new Progress();
        RetryController retry = new RetryController(progress.inputValue());
        if (retry.getProgress().equals(RETRY)) {
            return true;
        }
        return false;
    }
}
