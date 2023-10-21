package baseball;

import static camp.nextstep.edu.missionutils.test.Assertions.assertRandomNumberInRangeTest;
import static camp.nextstep.edu.missionutils.test.Assertions.assertSimpleTest;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import baseball.model.RandomNumberCreator;
import camp.nextstep.edu.missionutils.test.NsTest;
import org.junit.jupiter.api.Test;

class ApplicationTest extends NsTest {
    @Test
    void 게임종료_후_재시작() {
        assertRandomNumberInRangeTest(
                () -> {
                    run("246", "135", "1", "597", "589", "2");
                    assertThat(output()).contains("낫싱", "3스트라이크", "1볼 1스트라이크", "3스트라이크", "게임 종료");
                },
                1, 3, 5, 5, 8, 9
        );
    }

    @Test
    void 랜덤숫자생성_테스트() {
        RandomNumberCreator randomNumber = new RandomNumberCreator();
        randomNumber.setRandomNumber();
        String generatedNumbers = randomNumber.getAnswer(); // 정답을 테스트코드에 들고 오는 게 맞을까?

        // 세 자릿수 테스트
        assertThat(randomNumber.getAnswer().length()).isEqualTo(3);

        // 숫자 범위 테스트
        for (int i = 0; i < 3; i++) {
            int numericValue = Character.getNumericValue(generatedNumbers.charAt(i));
            assertThat(numericValue).isBetween(1, 9);
        }

        // 숫자 중복 여부 테스트
        int num1 = Character.getNumericValue(generatedNumbers.charAt(0));
        int num2 = Character.getNumericValue(generatedNumbers.charAt(1));
        int num3 = Character.getNumericValue(generatedNumbers.charAt(2));
        assertThat(num1).isNotEqualTo(num2);
        assertThat(num1).isNotEqualTo(num3);
        assertThat(num2).isNotEqualTo(num3);
    }

    @Test
    void 예외_테스트() {
        assertSimpleTest(() ->
                assertThatThrownBy(() -> runException("1234"))
                        .isInstanceOf(IllegalArgumentException.class)
        );
    }

    @Override
    public void runMain() {
        Application.main(new String[]{});
    }
}
