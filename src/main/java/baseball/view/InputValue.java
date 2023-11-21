package baseball.view;

import camp.nextstep.edu.missionutils.Console;

public class InputValue {
    public static String inputAnswer() {
        System.out.print(InputMessage.INPUT_ANSWER);
        return Console.readLine();
    }

    public static String inputProgress() {
        System.out.println(InputMessage.INPUT_PROGRESS);
        return Console.readLine();
    }
}
