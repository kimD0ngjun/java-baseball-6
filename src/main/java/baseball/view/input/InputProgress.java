package baseball.view.input;

import baseball.view.message.InputMessage;
import camp.nextstep.edu.missionutils.Console;

public class InputProgress {
    public static String inputProgress() {
        System.out.println(InputMessage.INPUT_PROGRESS.getMessage());
        return Console.readLine();
    }
}
