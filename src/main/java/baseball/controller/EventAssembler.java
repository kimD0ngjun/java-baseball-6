package baseball.controller;

import baseball.domain.entity.numbers.RandomNumbers;
import baseball.domain.entity.numbers.UserNumbers;
import baseball.view.input.Answer;
import baseball.view.input.Input;
import baseball.view.message.GuideMessage;

public class EventAssembler {
    public void startBaseball() {
        System.out.println(GuideMessage.START_MESSAGE.getMessage());

        RandomNumbers question = new RandomNumbers();

        Input answer = new Answer();
        UserNumbers userNumbers = new UserNumbers(answer.inputValue());
    }
}
