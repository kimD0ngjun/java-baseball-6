package baseball.controller;

import baseball.view.input.Input;
import baseball.view.input.Progress;

public class EventAssembler {

    public void startBaseball() {
        do {
            GameController game = new GameController();
            game.gamePhase();
        } while (retryGame());
    }

    private boolean retryGame() {
        Input progress = new Progress();
        RetryController retry = new RetryController(progress.inputValue());
        if (retry.getProgress().equals("1")) {
            return true;
        }
        return false;
    }
}
