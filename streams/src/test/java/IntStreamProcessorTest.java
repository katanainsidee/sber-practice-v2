import static org.junit.jupiter.api.Assertions.*;

import SteamsPackage.IntStreamProcessor;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

class IntStreamProcessorTest {
    @Test
    void testSortTwoDigitNumbers() {
        IntStreamProcessor processor = new IntStreamProcessor();
        int[] numbers = {5, 12, 45, 32, 87, 23, 18, 7, 91, 34};
        List<Integer> expected = Arrays.asList(12, 18, 23, 32, 34, 45, 87, 91);
        assertEquals(expected, processor.sortTwoDigitNumbers(numbers));
    }

    @Test
    public void testFindAverage() {
        IntStreamProcessor processor = new IntStreamProcessor();
        int[] numbers = {5, 12, 45, 32, 87, 23, 18, 7, 91, 34};
        double expected = 35.4;
        assertEquals(expected, processor.findAverage(numbers).orElse(Double.NaN), 0.001);
    }

    @Test
    public void testFindAverageEmptyArray() {
        IntStreamProcessor processor = new IntStreamProcessor();
        int[] numbers = {};
        assertFalse(processor.findAverage(numbers).isPresent());
    }
}
