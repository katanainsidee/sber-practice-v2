import static org.junit.Assert.*;

import SomeClasses.ClassC;
import org.junit.Test;

public class ClassCTest {
    @Test
    public void testMethodC() throws Exception {
        ClassC classC = new ClassC();

        String result = classC.avgMethodC();
        assertEquals("C", result);
    }
}
