package baseball.domain;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RandomNumbersTest {
    private static List<Integer> testRandomNumbers;

    @DisplayName("테스트 시작 전에 문제 난수를 생성한다.")
    @BeforeAll
    static void setUp() {
        RandomNumbers randomNumbers = new RandomNumbers();
        testRandomNumbers = randomNumbers.getRandomNumbers();
    }

    @DisplayName("난수는 총 세 자리다.")
    @Test
    void testLengthOfRandomNumbers() {
        assertThat(testRandomNumbers.size()).isEqualTo(3);
    }

    @DisplayName("난수 단위의 생성 범위는 1부터 9까지다.")
    @Test
    void testRangeOfRandomNumbers() {
        for (int number : testRandomNumbers) {
            assertThat(number).isBetween(1, 9);
        }
    }
}
