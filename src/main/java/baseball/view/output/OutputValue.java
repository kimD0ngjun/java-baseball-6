package baseball.view.output;

import baseball.domain.dto.CountDto;
import baseball.view.message.OutputMessage;

public class OutputValue implements Output {
    @Override
    public void outputCount(CountDto countDto) {
        final int ball = countDto.getBall();
        final int strike = countDto.getStrike();
        outputBallStrike(ball, strike);
    }

    private void outputBallStrike(int ball, int strike) {
        if (strike == 0) {
            System.out.println(OutputMessage.BALL.getMessage(ball));
        }
        if (ball == 0) {
            System.out.println(OutputMessage.STRIKE.getMessage(strike));
        }
        if (ball != 0 && strike != 0) {
            System.out.println(OutputMessage.BALL_STRIKE.getMessage(ball, strike));
        }
    }
}
