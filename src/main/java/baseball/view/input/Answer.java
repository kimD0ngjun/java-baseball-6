package baseball.view.input;

import baseball.view.message.InputMessage;
import camp.nextstep.edu.missionutils.Console;

public class Answer implements Input {

    @Override
    public String inputValue() {
        System.out.print(InputMessage.INPUT_ANSWER.getMessage());
        return Console.readLine();
    }
}
