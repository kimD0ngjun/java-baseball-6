package baseball;

import baseball.controller.EventAssembler;
import baseball.view.message.GuideMessage;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        System.out.println(GuideMessage.START_MESSAGE.getMessage());
        EventAssembler event = new EventAssembler();
        event.startBaseball();
    }
}
