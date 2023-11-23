package baseball.controller;

import static baseball.utility.ProgressValidator.validateProgress;

import baseball.domain.dto.CountDto;
import baseball.domain.entity.count.Ball;
import baseball.domain.entity.count.Count;
import baseball.domain.entity.count.Strike;
import baseball.domain.entity.numbers.RandomNumbers;
import baseball.domain.entity.numbers.UserNumbers;
import baseball.view.input.Answer;
import baseball.view.input.Input;
import baseball.view.input.Progress;
import baseball.view.message.GuideMessage;
import baseball.view.output.Output;
import baseball.view.output.OutputValue;

public class EventAssembler {
    private int ballCount;
    private int strikeCount;
    private int progressNumber;

    public void startBaseball() {
        System.out.println(GuideMessage.START_MESSAGE.getMessage());

        do {

            RandomNumbers randomNumbers = new RandomNumbers();

            do {
                Input answer = new Answer();
                UserNumbers userNumbers = new UserNumbers(answer.inputValue());

                Count ball = new Ball(userNumbers, randomNumbers);
                Count strike = new Strike(userNumbers, randomNumbers);

                ballCount = ball.calculateCount().getBall();
                strikeCount = strike.calculateCount().getStrike();

                CountDto dto = new CountDto(ballCount, strikeCount);

                Output output = new OutputValue();
                output.outputCount(dto);

                if (strikeCount == 3) {
                    System.out.println(GuideMessage.END_MESSAGE.getMessage());
                }
            } while (strikeCount != 3);

            Input progress = new Progress();
            validateProgress(progress.inputValue());
            progressNumber = Integer.parseInt(progress.inputValue());
        } while (progressNumber != 2);
    }
}
