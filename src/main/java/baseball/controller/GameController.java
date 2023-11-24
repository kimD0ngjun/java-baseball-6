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

public class GameController {
    private int ballCount;
    private int strikeCount;

    public void gamePhase() {
        RandomNumbers randomNumbers = new RandomNumbers();

        do {
            playSingleRound(randomNumbers);

            if (strikeCount == 3) {
                System.out.println(GuideMessage.END_MESSAGE.getMessage());
            }
        } while (strikeCount != 3);
    }

    private void playSingleRound(RandomNumbers randomNumbers) {
        Input answer = new Answer();
        UserNumbers userNumbers = new UserNumbers(answer.inputValue());

        calculateCount(userNumbers, randomNumbers);

        CountDto dto = new CountDto(ballCount, strikeCount);

        Output output = new OutputValue();
        output.outputCount(dto);
    }

    private void calculateCount(UserNumbers userNumbers, RandomNumbers randomNumbers) {
        Count ball = new Ball(userNumbers, randomNumbers);
        Count strike = new Strike(userNumbers, randomNumbers);

        ballCount = ball.calculateCount().getBall();
        strikeCount = strike.calculateCount().getStrike();
    }
}
