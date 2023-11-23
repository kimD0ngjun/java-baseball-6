package baseball.view.output;

import baseball.domain.dto.CountDto;
import baseball.view.message.OutputMessage;

public class OutputValue implements Output {
    @Override
    public void outputCount(CountDto countDto) {
        final int ball = countDto.getBall();
        final int strike = countDto.getStrike();
        outputResult(ball, strike);
    }

    private void outputResult(int ball, int strike) {
        outputBall(ball, strike);
        outputStrike(ball, strike);
        outputBallStrike(ball, strike);
    }

    private void outputNothing(int ball, int strike) {
        if (strike == 0 && ball == 0) {
            System.out.println(OutputMessage.Nothing.getMessage());
        }
    }

    private void outputBall(int ball, int strike) {
        if (strike == 0 && ball != 0) {
            System.out.println(OutputMessage.BALL.getMessage(ball));
        }
    }

    private void outputStrike(int ball, int strike) {
        if (ball == 0 && strike != 0) {
            System.out.println(OutputMessage.STRIKE.getMessage(strike));
        }
    }

    private void outputBallStrike(int ball, int strike) {
        if (ball != 0 && strike != 0) {
            System.out.println(OutputMessage.BALL_STRIKE.getMessage(ball, strike));
        }
    }
}
