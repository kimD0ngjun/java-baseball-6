package baseball.domain;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BallTest {
    private static RandomNumbers randomNumbers;

    @BeforeAll
    static void setUp() {
        randomNumbers = mock(RandomNumbers.class);
        when(randomNumbers.getRandomNumbers()).thenReturn(Arrays.asList(1, 2, 3));
    }

    @DisplayName("0개의 볼카운트 케이스")
    @Test
    void testBallCounting0() {
        String[] cases = {"456", "123"};

        for (String caseString : cases) {
            UserNumbers userNumbers = new UserNumbers(caseString);

            Ball ball = new Ball(userNumbers, randomNumbers);
            assertThat(ball.count).isEqualTo(0);
        }
    }

    @DisplayName("1개의 볼카운트 케이스")
    @Test
    void testBallCounting1() {
        String[] cases = {"451", "245", "135"};

        for (String caseString : cases) {
            UserNumbers userNumbers = new UserNumbers(caseString);

            Ball ball = new Ball(userNumbers, randomNumbers);
            assertThat(ball.count).isEqualTo(1);
        }
    }

    @DisplayName("2개의 볼카운트 케이스")
    @Test
    void testBallCounting2() {
        String[] cases = {"392", "412", "341"};

        for (String caseString : cases) {
            UserNumbers userNumbers = new UserNumbers(caseString);

            Ball ball = new Ball(userNumbers, randomNumbers);
            assertThat(ball.count).isEqualTo(2);
        }
    }

    @DisplayName("3개의 볼카운트 케이스")
    @Test
    void testBallCounting3() {
        String[] cases = {"231", "312"};

        for (String caseString : cases) {
            UserNumbers userNumbers = new UserNumbers(caseString);

            Ball ball = new Ball(userNumbers, randomNumbers);
            assertThat(ball.count).isEqualTo(3);
        }
    }
}
