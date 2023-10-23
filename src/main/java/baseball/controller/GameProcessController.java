package baseball.controller;

import baseball.model.IsGameClear;
import baseball.model.RandomNumberCreator;
import baseball.model.UserNumberChecker;
import baseball.model.UserNumberGrader;
import baseball.view.MessageOutputView;
import baseball.view.UserInputView;


public class GameProcessController {
    private final RandomNumberCreator answer;
    private static UserNumberChecker userNumber;
    private final UserNumberGrader grade;
    private static IsGameClear clear;

    public GameProcessController() {
        answer = new RandomNumberCreator();
        answer.setRandomNumber(); // 랜덤 숫자 생성
        userNumber = new UserNumberChecker();
        grade = new UserNumberGrader(); // 채점 기능 생성
        clear = new IsGameClear(grade);
    }

    public void startGame() {
//        do {
//            gameLogic();
//        } while (retryGame());
        do {
            userNumber.updateUserNumber(UserInputView.setInputNumber()); // 사용자 입력을 받는 부분
            gradeMessage(gradeBallStrike()); // 볼과 스트라이크를 계산해서 채점 결과를 출력하는 부분
//            System.out.println(endGame());
//            System.out.println(userNumber.getUserNumber());
        } while (!endGame());
    }

//    public static boolean retryGame() {
//        RetryGame retryNumber = new RetryGame(UserInputView.setInputRetry());
//
//        if (retryNumber.getRetryNumber().equals("1")) {
//            return true;
//        }
//
//        return false;
//    }

    // 시작 메시지는 프로그램 실행 후 딱 한 번 나오고 나머지 과정들은 무한반복
//    public void gameLogic() {
//        do {
//            userNumber.updateUserNumber(UserInputView.setInputNumber()); // 사용자 입력을 받는 부분
//            gradeMessage(gradeBallStrike()); // 볼과 스트라이크를 계산해서 채점 결과를 출력하는 부분
////            System.out.println(endGame());
////            System.out.println(userNumber.getUserNumber());
//        } while (!endGame());
//    }


    // 게임 클리어 여부
    public boolean endGame() {
        boolean gameClear = clear.getResultGrade(userNumber.getUserNumber(), answer.getAnswer());
        return gameClear;
    }

//    // 사용자 입력값 받아오기
//    public void userInputValue() {
//        UserNumberChecker checker = new UserNumberChecker(UserInputView.setInputNumber());
//        checker.getUserNumber();
//    }

    // 정답과 입력값 비교해서 채점하기
    public int[] gradeBallStrike() {
        return grade.grader(userNumber.getUserNumber(), answer.getAnswer());
    }

    // 채점 결과 출력
    public void gradeMessage(int[] ballStrike) {
        ballMessage(ballStrike);
        ballStrikeMessage(ballStrike);
        strikeMessage(ballStrike);
        nothingMessage(ballStrike);
        endGameMessage(ballStrike);
    }

    // 볼과 스트라이크 출력
    // 표현 방법 : n볼 / n볼 n스트라이크 / n스트라이크

    // 볼 출력
    public static void ballMessage(int[] ballStrike) {
        if (ballStrike[0] != 0 && ballStrike[1] == 0) {
            MessageOutputView.ballStrikeCountMessage(ballStrike[0]);
            MessageOutputView.ballMessage();
        }
    }

    // 볼과 스트라이크 같이 출력
    public static void ballStrikeMessage(int[] ballStrike) {
        if (ballStrike[0] != 0 && ballStrike[1] != 0) {
            MessageOutputView.ballStrikeCountMessage(ballStrike[0]);
            MessageOutputView.ballSpaceMessage();
            MessageOutputView.ballStrikeCountMessage(ballStrike[1]);
            MessageOutputView.strikeMessage();
        }
    }

    // 스트라이크 출력
    public static void strikeMessage(int[] ballStrike) {
        if (ballStrike[0] == 0 && ballStrike[1] != 0) {
            MessageOutputView.ballStrikeCountMessage(ballStrike[1]);
            MessageOutputView.strikeMessage();
        }
    }

    // 낫싱 출력
    public static void nothingMessage(int[] ballStrike) {
        if (ballStrike[0] == 0 && ballStrike[1] == 0) {
            MessageOutputView.incorrectAnswerMessage();
        }
    }

    // 게임 종료 메시지 출력
    public static void endGameMessage(int[] ballStrike) {
        if (ballStrike[1] == 3) {
            MessageOutputView.endGameMessage();
        }
    }

}
