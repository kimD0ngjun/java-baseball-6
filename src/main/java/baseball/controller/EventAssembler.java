package baseball.controller;

import baseball.domain.dto.CountDto;
import baseball.domain.entity.count.Ball;
import baseball.domain.entity.count.Count;
import baseball.domain.entity.count.Strike;
import baseball.domain.entity.numbers.RandomNumbers;
import baseball.domain.entity.numbers.UserNumbers;
import baseball.view.input.Answer;
import baseball.view.input.Input;
import baseball.view.message.GuideMessage;
import baseball.view.output.Output;
import baseball.view.output.OutputValue;

public class EventAssembler {
    public void startBaseball() {
        System.out.println(GuideMessage.START_MESSAGE.getMessage());

        RandomNumbers randomNumbers = new RandomNumbers();

        Input answer = new Answer();
        UserNumbers userNumbers = new UserNumbers(answer.inputValue());

        Count ball = new Ball(userNumbers, randomNumbers);
        Count strike = new Strike(userNumbers, randomNumbers);

        CountDto dto = new CountDto(ball.calculateCount().getBall(), strike.calculateCount().getStrike());

        Output output = new OutputValue();
        output.outputCount(dto);
    }
}
