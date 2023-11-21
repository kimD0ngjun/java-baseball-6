package baseball.view.input;

import baseball.view.message.InputMessage;
import camp.nextstep.edu.missionutils.Console;

public class InputAnswer {
    public static String inputAnswer() {
        System.out.print(InputMessage.INPUT_ANSWER);
        return Console.readLine();
    }
}
