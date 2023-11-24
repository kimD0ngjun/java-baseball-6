package baseball.service;

import baseball.utility.ProgressValidator;

public class GameRetryer {
    private String progress;

    public GameRetryer(String progress) {
        ProgressValidator.validateProgress(progress);
        this.progress = progress;
    }

    public String getProgress() {
        return progress;
    }
}
