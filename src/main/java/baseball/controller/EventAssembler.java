package baseball.controller;

import baseball.domain.numbers.RandomNumbers;
import baseball.domain.numbers.UserNumbers;
import baseball.view.input.InputAnswer;
import baseball.view.message.GuideMessage;

public class EventAssembler {
    public void startBaseball() {
        System.out.println(GuideMessage.START_MESSAGE.getMessage());

        RandomNumbers question = new RandomNumbers();

        String inputNumbers = InputAnswer.inputAnswer();
        UserNumbers userNumbers = new UserNumbers(inputNumbers);
    }
}
