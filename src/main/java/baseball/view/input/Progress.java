package baseball.view.input;

import baseball.view.message.InputMessage;
import camp.nextstep.edu.missionutils.Console;

public class Progress implements Input {

    @Override
    public String inputValue() {
        System.out.println(InputMessage.INPUT_PROGRESS.getMessage());
        return Console.readLine();
    }
}
