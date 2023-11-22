package baseball.domain;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StrikeTest {
    private static RandomNumbers randomNumbers;

    @BeforeAll
    static void setUp() {
        randomNumbers = mock(RandomNumbers.class);
        when(randomNumbers.getRandomNumbers()).thenReturn(Arrays.asList(1, 2, 3));
    }

    @DisplayName("0개의 스트라이크 카운트 케이스")
    @Test
    void testBallCounting0() {
        String[] cases = {"456", "231", "312"};

        for (String caseString : cases) {
            UserNumbers userNumbers = new UserNumbers(caseString);

            Strike strike = new Strike(userNumbers, randomNumbers);
            assertThat(strike.count).isEqualTo(0);
        }
    }

    @DisplayName("1개의 스트라이크 카운트 케이스")
    @Test
    void testBallCounting1() {
        String[] cases = {"145", "132", "453"};

        for (String caseString : cases) {
            UserNumbers userNumbers = new UserNumbers(caseString);

            Strike strike = new Strike(userNumbers, randomNumbers);
            assertThat(strike.count).isEqualTo(1);
        }
    }

    @DisplayName("2개의 스트라이크 카운트 케이스")
    @Test
    void testBallCounting2() {
        String[] cases = {"193", "124", "623"};

        for (String caseString : cases) {
            UserNumbers userNumbers = new UserNumbers(caseString);

            Strike strike = new Strike(userNumbers, randomNumbers);
            assertThat(strike.count).isEqualTo(2);
        }
    }

    @DisplayName("3개의 스트라이크 카운트 케이스")
    @Test
    void testBallCounting3() {
        String caseString = "123";

        UserNumbers userNumbers = new UserNumbers(caseString);

        Strike strike = new Strike(userNumbers, randomNumbers);
        assertThat(strike.count).isEqualTo(3);

    }
}
