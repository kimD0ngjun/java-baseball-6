package baseball.view.input;

import baseball.view.message.InputMessage;
import camp.nextstep.edu.missionutils.Console;

public class InputAnswer {
    // static 지양하기

    public static String inputAnswer() {
        System.out.print(InputMessage.INPUT_ANSWER.getMessage());
        return Console.readLine();
    }
}
