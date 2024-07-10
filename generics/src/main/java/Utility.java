import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Utility {
    public static <T extends Number> int countEvenNumbers(Collection<T> collection) {
        int count = 0;
        for (T number : collection) {
            if (number != null && number.longValue() % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static void swapElements(List<?> list, int index1, int index2) {
        swapHelper(list, index1, index2);
    }

    private static <T> void swapHelper(List<T> list, int index1, int index2) {
        Collections.swap(list, index1, index2);
    }
}
