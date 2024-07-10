import java.util.Collection;

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
}
