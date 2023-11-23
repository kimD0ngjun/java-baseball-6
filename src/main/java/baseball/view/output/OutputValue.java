package baseball.view.output;

import baseball.domain.dto.CountDto;

public class OutputValue implements Output {
    @Override
    public void outputCount(CountDto countDto) {
        final int ball = countDto.getBall();
        final int strike = countDto.getStrike();
    }
}
