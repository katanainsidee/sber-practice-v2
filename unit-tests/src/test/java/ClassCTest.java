import static org.junit.Assert.*;

import SomeClasses.ClassC;
import org.junit.Test;

public class ClassCTest {
    @Test
    public void testMethodC() {
        ClassC classC = new ClassC();

        String result = classC.avgMethodC();
        assertEquals("C", result);
    }

    @Test
    public void testMethodCThrowsException() {
        ClassC classC = new ClassC();

        Exception exception = assertThrows(Exception.class, classC::methodC);

        assertEquals("Exception in methodC", exception.getMessage());
    }
}
