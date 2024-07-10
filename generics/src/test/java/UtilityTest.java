import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import UtilityPackage.Utility;
import org.junit.Test;

public class UtilityTest {
    @Test
    public void testCountEvenNumbersWithIntegers() {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int count = Utility.countEvenNumbers(integerList);
        assertEquals(5, count);
    }

    @Test
    public void testCountEvenNumbersWithDoubles() {
        List<Double> doubleList = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0, 6.0);
        int count = Utility.countEvenNumbers(doubleList);
        assertEquals(3, count);
    }

    @Test
    public void testCountEvenNumbersWithMixedNumbers() {
        List<Number> mixedList = Arrays.asList(1, 2.0, 3, 4.0, 5, 6L);
        int count = Utility.countEvenNumbers(mixedList);
        assertEquals(3, count);
    }

    @Test
    public void testSwapElements() {
        List<String> stringList = Arrays.asList("one", "two", "three", "four");
        Utility.swapElements(stringList, 1, 3);
        assertEquals(Arrays.asList("one", "four", "three", "two"), stringList);

        List<Integer> intList = Arrays.asList(1, 2, 3, 4);
        Utility.swapElements(intList, 0, 2);
        assertEquals(Arrays.asList(3, 2, 1, 4), intList);
    }
}
