package baseball.controller;

import baseball.utility.ProgressValidator;

public class RetryController {
    private String progress;

    public RetryController(String progress) {
        ProgressValidator.validateProgress(progress);
        this.progress = progress;
    }

    public String getProgress() {
        return progress;
    }
}
