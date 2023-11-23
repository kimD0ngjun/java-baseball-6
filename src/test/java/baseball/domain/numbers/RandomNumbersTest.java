package baseball.domain.numbers;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import baseball.domain.entity.numbers.RandomNumbers;
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
        testRandomNumbers = randomNumbers.getNumbers();
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

    @DisplayName("닌수 단위는 서로 중복이 아니다.")
    @Test
    void testDuplicatesOfRandomNumbers() {
        int size = testRandomNumbers.size();
        for (int i = 0; i < size - 1; i++) {
            checkDuplicatesOfRandomNumber(i);
        }
    }

    void checkDuplicatesOfRandomNumber(int index) {
        for (int j = index + 1; j < testRandomNumbers.size(); j++) {
            assertThat(testRandomNumbers.get(index)).isNotEqualTo(testRandomNumbers.get(j));
        }
    }
}
